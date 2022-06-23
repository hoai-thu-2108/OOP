package hust.soict.hedspi.aims.disc;
public class CompactDisc {
	private String title;
	private float price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public CompactDisc(String title, float price) {
		super();
		this.title = title;
		this.price = price;
	}
	public CompactDisc() {
		super();
	}
}
