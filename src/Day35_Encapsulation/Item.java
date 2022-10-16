package Day35_Encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank() || containsSpecial(name) || !startsWithLetters(name)) {
            System.out.println("name can not be empty or blank\n" +
                    "name can not contain any special characters other than space\n" +
                    "name must start with letters ");
            System.exit(0);
        }

        this.name = name;
    }

    private boolean containsSpecial(String str) {
        for (char c : str.toCharArray()) {
            if( !(Character.isLetterOrDigit(c) || (c == ' ')) ) {
                return true;
            }
        }
        return false;
    }

    private boolean startsWithLetters(String str) {
        return Character.isAlphabetic(str.charAt(0));
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice < 0) {
            System.out.println("Unit price can not be negative!");
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0) {
            System.out.println("Quantity can not be negative!");
            System.exit(0);
        } else if(name.equalsIgnoreCase("toilet paper") && quantity > 1) {
            System.out.println("Toilet paper can not be more than 1");
            System.exit(0);
        }
        this.quantity = quantity;
    }

    private double totalCost() {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + totalCost() +
                '}';
    }
}
/*
4. Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()


 */