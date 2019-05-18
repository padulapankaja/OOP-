package Q1;

public class Car  extends Item{
	
	private String type;
	private String model;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @param itemNo
	 * @param description
	 * @param unitPrice
	 * @param type
	 * @param model
	 */
	public Car(String itemNo, String description, double unitPrice, String type, String model) {
		super(itemNo, description, unitPrice);
		this.type = type;
		this.model = model;
	}
	public void Display()
	{
		System.out.println("Item No: " +ItemNo);
		System.out.println("Description : " +Description);
		System.out.println("UnitPrice : " +UnitPrice);
		System.out.println("Type : " +type);
		System.out.println("Model : " +model);
		
	}
	
	

}
