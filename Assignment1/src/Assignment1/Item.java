package Assignment1;

public class Item{
	private String name;
	private double totalPrice;
	private int qty;
	
	public Item(String name ,int qty , double unitPrice){
		this.name = name;
		this.qty =qty;
		totalPrice =qty*unitPrice;
		
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setTotalPrice(double totalPrice){
		this.totalPrice=totalPrice;
	}
	
	public double getTotalPrice(){
		return totalPrice;
		
	}
	
	public void setQty(int qty){
		this.qty=qty;
	}
	public int getQty(){
		return qty;
	}
	

}
