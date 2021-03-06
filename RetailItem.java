//=============================================================================
// Retail Item class
//=============================================================================

public class RetailItem 
{
	private String description;
	private int unitsOnHand;
	private double price;

	// Constructor
	public RetailItem(String d, int u, double p) {
		description =d;
		unitsOnHand = u;
		price = p;
	}

		// set methods
		public void setDescription(String d){
			description = d;
		}

		public void setUnitsOnHand(int u) {
			unitsOnHand = u;
		}

		public void setPrice(double p) {
			price = p;
		}

		// get methods
		public String getDescription() {
			return description;
		}

		public int getUnitsOnHand() {
			return unitsOnHand;
		}

		public double getPrice() {
			return price;
		}

}
