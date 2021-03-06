// Driver for the RetailItem class exercise
// Program needed us to create 3 objects in memory, assign their addresses to 3 different reference variables,
// and use a constructor to initialize each object and print out their values using an accessor method.

public class RetailItemDemo {

	public static void main(String[] args) {

		RetailItem itemOne = new RetailItem("Jacket", 12, 59.95);
		RetailItem itemTwo = new RetailItem("Jeans", 40, 39.95);
		RetailItem itemThree = new RetailItem("Shirt", 20, 24.95);

		System.out.printf("Description: " + itemOne.getDescription() + "\t");
		System.out.printf("Item: " + itemOne.getUnitsOnHand() + "\t");
		System.out.println("Price: " + itemOne.getPrice() + "\t");
		System.out.println("----------------------------------------------------------");

		System.out.printf("Description: " + itemTwo.getDescription() + "\t");
		System.out.printf("Item: " + itemTwo.getUnitsOnHand() + "\t");
		System.out.println("Price: " + itemTwo.getPrice() + "\t");
		System.out.println("----------------------------------------------------------");

		System.out.printf("Description: " + itemThree.getDescription() + "\t");
		System.out.printf("Item: " + itemThree.getUnitsOnHand() + "\t");
		System.out.println("Price: " + itemThree.getPrice() + "\t");
		System.out.println("----------------------------------------------------------");

	}

}
