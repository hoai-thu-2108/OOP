package hust.soict.hedspi.aims.disc;
public class DigitalVideoDisc {
	private String title;
	private float price;

    public DigitalVideoDisc(String the_Lion_King) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
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
	public DigitalVideoDisc(String title, float price) {
		super();
		this.title = title;
		this.price = price;
	}
	public DigitalVideoDisc() {
		super();
	}
        public boolean search (String title){
             String[] strArr = title.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            if (this.getTitle().toLowerCase().indexOf(strArr[i].toLowerCase()) == -1)
                return false;
        }
        return true;
        }

    public void setCategory(String animation) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setCost(float f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDirector(String roger_Allers) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setLength(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
               
}
