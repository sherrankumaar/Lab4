class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() { return model; }
    public String getBrand() { return brand; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public String getColor() { return color; }
    public int getQuantity() { return quantity; }

    public void setModel(String model) { this.model = model; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setYear(int year) { this.year = year; }
    public void setPrice(double price) { this.price = price; }
    public void setColor(String color) { this.color = color; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void delivery(int delivered) {
        quantity += delivered;
        System.out.println("Delivered " + delivered + " car(s). New quantity: " + quantity);
    }
    public void sell(int sold) {
        if (sold > quantity) {
            System.out.println("Not enough cars in stock to sell " + sold);
        } else {
            quantity -= sold;
            System.out.println("Sold " + sold + " car(s). New quantity: " + quantity);
        }
    }

    @Override
    public String toString() {
        return "Car [" + "model=" + model
                + ", brand=" + brand
                + ", year=" + year
                + ", price=" + price
                + ", color=" + color
                + ", quantity=" + quantity + "]";
    }
}

public class Task2 {
    public static void main(String[] args) {

        Car myCar = new Car("Model S", "Tesla", 2020, 79999.99, "Red", 10);

        System.out.println("Initial car details: " + myCar);

        myCar.sell(2);

        System.out.println("After selling:");
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Price: " + myCar.getPrice());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Quantity: " + myCar.getQuantity());

        myCar.setModel("Model 3");
        myCar.setBrand("Tesla X");
        myCar.setYear(2021);
        myCar.setPrice(75999.99);
        myCar.setColor("Blue");
        myCar.setQuantity(5);

        myCar.delivery(5);

        System.out.println("Updated car details: " + myCar);
    }
}
