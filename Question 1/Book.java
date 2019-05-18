package Q1;

public class Book extends Item {

	private String publisher;
	private String category;
	private int pages;
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	/**
	 * @param itemNo
	 * @param description
	 * @param unitPrice
	 * @param publisher
	 * @param category
	 * @param pages
	 */
	public Book(String itemNo, String description, double unitPrice, String publisher, String category, int pages) {
		super(itemNo, description, unitPrice);
		this.publisher = publisher;
		this.category = category;
		this.pages = pages;
	}

	
	public void Display()
	{
		System.out.println("Item No: " +ItemNo);
		System.out.println("Description : " +Description);
		System.out.println("UnitPrice : " +UnitPrice);
		System.out.println("Publisher : " +publisher);
		System.out.println("Category : " +category);
		System.out.println("Pages  : " +pages);
		
	}
	
	
	
}
