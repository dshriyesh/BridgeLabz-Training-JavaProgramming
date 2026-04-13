// 11. Create a program to find the bonus of 10 employees based on their years of service as well
// as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with
// the old and new salary.
// Hint =>
// a. Zara decides to give a bonus of 5% to employees whose year of service is more than 5
// years or 2% if less than 5 years
// b. Create a Method to determine the Salary and years of service and return the same. Use
// the Math.random() method to determine the 5-digit salary for each employee and also
// use the random method to determine the years of service. Define 2D Array to save the
// salary and years of service.
// c. Write a Method to calculate the new salary and bonus based on the logic defined above
// and return the new 2D Array of the latest salary and bonus amount
// d. Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and
// the Total Bonus Amount and display it in a Tabular Format



public class ZaraBonus {
    public static void main(String[] args) {

        double[][] empData = generateEmployeeData(10);

        double[][] updatedData = calculateBonus(empData);

        displayReport(empData, updatedData);
    }

    // b. Generate salary (5-digit) & years of service
    public static double[][] generateEmployeeData(int size) {
        double[][] data = new double[size][2]; // [salary, years]

        for (int i = 0; i < size; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;

            // Years of service: 1 to 10
            data[i][1] = (int)(Math.random() * 10) + 1;
        }

        return data;
    }

    // bonus & new salary
    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][2]; // [newSalary, bonus]

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];

            double bonus;

            if (years > 5) {
                bonus = salary * 0.05; // 5%
            } else {
                bonus = salary * 0.02; // 2%
            }

            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }

        return result;
    }

    public static void displayReport(double[][] oldData, double[][] newData) {

        double totalOld = 0;
        double totalNew = 0;
        double totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-12s %-10s\n",
                "ID", "OldSal", "Years", "Bonus", "NewSal");
                System.out.println();

        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOld += oldSalary;
            totalNew += newSalary;
            totalBonus += bonus;

            System.out.printf("%-5d %-10.0f %-10.0f %-12.2f %-10.2f\n",
                    (i + 1), oldSalary, years, bonus, newSalary);
                    System.out.println();
        }
        System.out.printf("TOTAL %-10.0f %-10s %-12.2f %-10.2f\n",
                totalOld, "", totalBonus, totalNew);
                System.out.println();
    }
}
