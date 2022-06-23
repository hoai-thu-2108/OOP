package hust.soict.hedspi.aims;
import hust.soict.globalict.aims.media.Media;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;
import java.awt.print.Book;
import java.util.Scanner;
public class Aims {
//        public static void showAdminMenu() {
//		System.out.println("Product Management Application: ");
//		System.out.println("--------------------------------");
//		System.out.println("1.Create new item");
//                System.out.println("2. Delete item by id");
//                System.out.println("3. Display the items list");
//                System.out.println("0. Exit");
//                System.out.println("--------------------------------");
//                System.out.println("Please choose a number: 0-1-2-3");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                showCreationMenu();
        }	
        public static void showMainMenu() {
        
    }
        public static Media creatMedia(MediaCreation mc){
            return mc.createMediaFromConsole();
        }
        public static void showCreationMenu(){
            System.out.println("--------------------------------");
            System.out.println("1. Create Book");
            System.out.println("2. Create DVD");
            System.out.println("3. Create CD");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            Scanner sc = new Scanner(System.in);
            int type = Integer.parseInt(sc.nextLine());
            switch (type){
                case 1 -> {
                    Book book = (Book) createMedia(new BookCreation());
                }
                case 2 -> {
                    DigitalVideoDisc dvd = (DigitalVideoDisc) createMedia
                            (new DigitalVideoDiscCreation());
                }
                case 3 -> {
                }
                case 0 -> {
                }
                   default -> {
                }
            }
            
        }
//		Order o1 = Order.createOrder();
//		Order o2 = Order.createOrder();
//		Order o3 = Order.createOrder();
//		Order o4 = Order.createOrder();
//		Order o5 = Order.createOrder();
//
//		Order o6 = Order.createOrder();
//		System.out.println(o6);
                
//                Order anOrder=new Order();
//		DigitalVideoDisc dvd1=new DigitalVideoDisc("The Lion King");
//		dvd1.setCategory("Animation");
//		dvd1.setCost(19.95f);
//		dvd1.setDirector("Roger Allers");
//		dvd1.setLength(87);
//		//anOrder.addDigitalVideoDisc(dvd1);
//		
//		DigitalVideoDisc dvd2=new DigitalVideoDisc("Star Wars");
//		dvd2.setCategory("Science Fiction");
//		dvd2.setCost(24.95f);
//		dvd2.setDirector("George Lucas");
//		dvd2.setLength(124);
//		//anOrder.addDigitalVideoDisc(dvd2);
//		
//		DigitalVideoDisc dvd3=new DigitalVideoDisc("Aladdin");
//		dvd3.setCategory("Animation");
//		dvd3.setCost(18.99f);
//		dvd3.setDirector("John Musker");
//		dvd3.setLength(90);
//		//anOrder.addDigitalVideoDisc(dvd3);
//		
//		System.out.print("Total Cost is: ");
//		System.out.println(anOrder.totalCost());
//                
//         
//	}

    private static class MediaCreation {

        public MediaCreation() {
        }
    }

}
