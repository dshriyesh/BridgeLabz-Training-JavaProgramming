// Create a program to calculate the profit and loss in number and percentage based on the
// cost price of INR 129 and the selling price of INR 191.
public class ProfitandLoss {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;

        
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.printf("The Cost Price is INR %.0f and Selling Price is INR %.0f%n" +
                          "The Profit is INR %.0f and the Profit Percentage is %.2f%%", 
                          costPrice, sellingPrice, profit, profitPercentage);
    }
}
