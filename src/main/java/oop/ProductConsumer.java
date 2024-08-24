package oop;


class Product{
	
	private int itemNo;
	private String name;
	private double price;
	private int qty;
	
	public int getItemNo() {
		return itemNo;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double p) {
		price =p;
	}
	public int getQty() {
		return qty;
	}
	public  void setQty( int q) {
		 qty = q;
	}
	
	public Product () {
		itemNo =1;
		name = "Bread";
		price =  20;
		qty =5;
	}
	public Product(int i, String n, double p, int q) {
		itemNo =i ;
		name = n;
		price = p;
		qty = q;
	}
	
}

class Consumer{
	private  String cusId;
	private  String name;
	private String address;
	private String phoneNo;
	
	public Consumer(String cusId, String name) {
		
		this.cusId=cusId;
		this.name = name;
	}
	public Consumer(String cusId, String name,String address,String phoneNo) {
		
		this.cusId = cusId;
		this.name= name;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
	public String getCusId() {
		
		return cusId;
	}
	public String getName() {
			
			return name;
		}
	public String getAddress() {
			
			return address;
		}
	public String getPhoneNo() {
			
			return phoneNo;
		}
	public void setAddress(String address) {
			this.address = address;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String toString() {
		return "Customer ID : "+ cusId +"Customer name : "+name+"Address : "+address+ "Mobile no: "+phoneNo;                    
	}
	
}

public class ProductConsumer {
	
	public static void main(String args[]) {
		
		Consumer c  = new Consumer("AT1704 ", "ATMAN ", "Coimbatore ", "987654");
		
		System.out.println("Consumer details:\n"+ c);
		
		
	}

}
