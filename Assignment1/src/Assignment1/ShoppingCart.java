package Assignment1;

public class ShoppingCart {
	private Item[] cart;
	private double totalPrice;
	private int storedItems;
	
	public ShoppingCart(){
		cart=new Item[5];
	}
	
	public ShoppingCart(int cartSize){
		cart=new Item[cartSize];
	}
	
	public void addItem(Item input){
		if(storedItems < cart.length){
			cart[storedItems]=input;
		storedItems++;
		} else {
			System.out.println("your cart is full");
		}
		 
	}
	/*public void removeItem(Item input)
	{
		if(cart.length>0){
			
		}
	} */
	
	public double calculateTotalPrice(){
		for(int i=0; i<cart.length; i++){
			totalPrice +=cart[i].getTotalPrice();
		}
		return totalPrice;
		
	}

}
