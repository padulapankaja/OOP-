package Q1;

public abstract class Item {

	protected String ItemNo;
	protected String Description;
	protected double UnitPrice;
	public String getItemNo() {
		return ItemNo;
	}
	public void setItemNo(String itemNo) {
		ItemNo = itemNo;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}
	
	
	/**
	 * @param itemNo
	 * @param description
	 * @param unitPrice
	 */
	public Item(String itemNo, String description, double unitPrice) {
		super();
		ItemNo = itemNo;
		Description = description;
		UnitPrice = unitPrice;
	}
	public void Display() {
		
		System.out.println("Item No: " +ItemNo);
		System.out.println("Description : " +Description);
		System.out.println("UnitPrice : " +UnitPrice);
	}
	
}
