package Assignment1;

public class Runtest {
	
	public static void main(String[] args){
		Item book=new Item("book",2,113);
		Item pencil=new Item("dark_pencil",1,5);
		Item eraser=new Item("apsra eraser",2,5);
		Item laptop=new Item("hp laptop",2,25000);
		Item wire=new Item("charger",2,1200);
		
		ShoppingCart a2=new ShoppingCart();
		a2.addItem(book);
		a2.addItem(pencil);
		a2.addItem(eraser);
		a2.addItem(laptop);
		a2.addItem(wire);
		a2.addItem(wire);
		System.out.println(a2.calculateTotalPrice());
	}

}
