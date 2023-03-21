//workng example of shopping cart
class Code{

	Item head;

	class Item{
		String itemName;
		float price;
		int qty;
		float total;
		Item next;

		Item(){}

		Item(String name,float price,int qty){
			this.itemName=name;
			this.price=price;
			this.qty=qty;
			this.total=(price*qty);
		}
	}
	
	void addItem(String name,float price,int qty){
		Item newItem = new Item(name,price,qty);
		if(head==null){
			head=newItem;
		}else{
			newItem.next=head;
			head=newItem;
		}
	}

	float totalBill(){
		float billAmount = 0.0f;
		Item currItem=head;
		if(currItem==null){
			System.out.println("No items to bill the amount");
		}
		while(currItem!=null){
			billAmount += currItem.total;
			currItem=currItem.next;
		}
		return billAmount;
	}

	public static void main(String[] args){
		Code c=new Code();
		c.addItem("Oat meal",12.05f,1);
		c.addItem("Chocolates",5.0f,2);
		System.out.println("Total bill amount: "+c.totalBill());
	}
}
