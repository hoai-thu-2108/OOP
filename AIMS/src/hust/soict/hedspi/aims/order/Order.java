package hust.soict.hedspi.aims.order;

import hust.soict.globalict.aims.media.Media;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import java.util.*;

public class Order {
	
	public static final int MAXIMUM_ORDERED_ITEMS = 10;
	public static final int MAXIMUM_ORDERS = 5;
	
	private static int nbOrders = 0;
	
	private int nbOrderedItems;
	private DigitalVideoDisc[] orderedItems = new DigitalVideoDisc [MAXIMUM_ORDERED_ITEMS];
    private ArrayList<Media> itemsOrdered;

	public Order() {
		super();
	}
	
	public static Order createOrder() {
		if (nbOrders >= MAXIMUM_ORDERS)
		{
			System.out.println("You have reached maximum orders");
			return null;
		}
		else {
			nbOrders ++;
			return new Order();
		}
        }
	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	public void addMedia(Media mediaName){
		if(!(itemsOrdered.contains(mediaName))){
			itemsOrdered.add(mediaName);
		}
	}
	public void removeMedia(Media mediaName){
		if((itemsOrdered.contains(mediaName))){
			itemsOrdered.remove(mediaName);
		}
	}
	public float totalCost(){
		float total=0;
		Media mediaItem;
		java.util.Iterator iter=itemsOrdered.iterator();
		while (iter.hasNext()) {
			mediaItem = (Media) (iter.next());
			total += mediaItem.getCost();
		}
		return total ;

        }

    //public void addDigitalVideoDisc(DigitalVideoDisc dvd1) {
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
}