import java.util.ArrayList;
import java.util.Scanner;

public class MyContactsApp {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Are you registered(y/n): ");
        char ch = sc.next().charAt(0);

        ArrayList<Register> contactArr = new ArrayList<>();
        ArrayList<Create> savedContact = new ArrayList<>();

        register(ch, sc, contactArr, savedContact);
    }

    // register
    static void register(char ch, Scanner sc, ArrayList<Register> arr, ArrayList<Create> createArr) {
        while (true) {
            if (ch == 'n' || ch == 'N') {
                sc.nextLine(); 

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter your phone no.: ");
                String phNo = sc.next();

                if (isAlreadyRegistered(phNo, arr)) {
                    System.out.println("User is already registered!");
                    login(sc, arr, createArr);
                    return;
                }

                Register user = new Register(name, phNo);
                user.displaySuccess();

                if (user.flag) {
                    arr.add(user);
                    System.out.println();
                    login(sc, arr, createArr);
                    return;
                }

            } else {
                login(sc, arr, createArr);
                return;
            }
        }
    }

    // existing user check
    static boolean isAlreadyRegistered(String number, ArrayList<Register> arr) {
        for (Register r : arr) {
            if (r.phNo.equals(number)) {
                return true;
            }
        }
        return false;
    }

    // login method
    static void login(Scanner sc, ArrayList<Register> registerArr, ArrayList<Create> createArr) {
        System.out.print("Enter phone number to login: ");
        String number = sc.next();
        sc.nextLine();

        for (Register r : registerArr) {
            if (r.phNo.equals(number)) {
                System.out.println("Login successful! Welcome " + r.name);

                boolean exists = false;
                for (Create c : createArr) {
                    if (c.phNo.equals(number)) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    createArr.add(new Create(r.name, r.phNo));
                }

                ManageContacts(sc, createArr);
                return;
            }
        }

        System.out.println("User not found. Please register first.");
        register('n', sc, registerArr, createArr);
    }

    // managing contact
    static void ManageContacts(Scanner sc, ArrayList<Create> arr) {

        while (true) {
            System.out.println("************** Welcome to Managing contact page ************"); 
            System.out.print("What would you like to do"); 
            System.out.println(" 'create', 'view', 'delete' (Enter your option)? ");

            String option = sc.nextLine();

            switch (option.toLowerCase()) {

                case "create":
                    System.out.print("Enter Name of contact: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = sc.next();
                    sc.nextLine();

                    Create contact = new Create(name, phone);
                    contact.display();

                    if (contact.flag) {
                        arr.add(contact);
                    } else {
                        System.out.println("Invalid contact. Try again.");
                    }
                    break;

                case "view":
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();
                    view(username, arr);
                    break;

                case "delete":
                    System.out.print("Enter name to delete: ");
                    String deleteName = sc.nextLine();
                    delete(deleteName, arr);
                    break;

                case "exit":
                    System.out.println("Exiting contact manager...");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    // view method
    static void view(String user, ArrayList<Create> arr) {
        for (Create c : arr) {
            if (c.name.equalsIgnoreCase(user)) {
                System.out.println("Username: " + c.name);
                System.out.println("Phone: " + c.phNo);
                return;
            }
        }
        System.out.println("User not found!");
    }

    // delete method
    static void delete(String user, ArrayList<Create> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).name.equalsIgnoreCase(user)) {
                arr.remove(i);
                System.out.println("User deleted successfully!");
                return;
            }
        }
        System.out.println("User not found!");
    }
}