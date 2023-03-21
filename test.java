import java.util.ArrayList;

class List{
	
	ArrayList<Item> li=new ArrayList<>();

	class Item{
		String itemName;
		int qty;
		float price;
		float totalPrice;

		Item(String itemName,int qty,float price){
			this.itemName = itemName;
			this.qty = qty;
			this.price = price;
			this.totalPrice = price*qty;
		}
	}
	
	void addData(String name,int qty,float price){
		Item newItem = new Item(name,qty,price);
		li.add(newItem);
	}

	int lenItem(){
		return li.size();
	}

	public static void main(String[] args){
		List l=new List();
		
		l.addData("Oat meal",1,12.05f);
		l.addData("Chocolate",3,1.024f);

		for(Item i:l.li){
			System.out.println(i.itemName);
		}

		System.out.println(l.lenItem());

	}
}
