import java.util.Scanner;

public class PallindromeString {
        String text;

    public PallindromeString(String text) {
        this.text=text;
    }

    void checker(String text){
        int i=0;
        int j=text.length()-1;
        while(i<j){
            if(text.charAt(i)!=text.charAt(j)){
                System.out.println("The given text is not pallindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("The given text is a pallindrome");
    }
        
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String str = sc.nextLine();
        PallindromeString obj = new PallindromeString(str);
        obj.checker(str);
    }
}
