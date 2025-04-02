public class HandleMobilePhoneDetails{
    public static void main(String[] args) {
    
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 79999);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23", 74999);
        MobilePhone phone3 = new MobilePhone("OnePlus", "OnePlus 11", 56999);


        phone1.display();
        phone2.display();
        phone3.display();
    }
}

class MobilePhone {
  
    String brand;
    String model;
    double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    
    void display() {
        System.out.printf("Brand: %s and Model: %s and Price: ₹%.2f\n", this.brand, this.model, this.price);
    }
    
    
	
}
	

