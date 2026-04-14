class MobilePhone {
    String brand;
    String model;
    int price;

    MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 70000);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14", 80000);

        phone1.displayDetails();
        phone2.displayDetails();
    }
}