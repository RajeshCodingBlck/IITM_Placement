package PriorityQueue_Question;

public class Product implements Comparable<Product> {
    
	String brand;
	int price;
	int review;
	
	Product(int price, int review , String brand){
		this.price= price;
		this.review= review;
		this.brand=brand;
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
//		if(this.review> o.review) {
//			return -1;
//		}else {
//			return 1;
//		}
		
		double val1= this.price*0.6 + this.review*0.4;
		double val2= o.price*0.6 + o.review*0.4;
		
		if(val1>val2) {
			return -1;
		}else {
			return 1;
		}
	}
	
	@Override
	public int hashCode() {
		
		return 31*review+1;
	}
	
	@Override
	public boolean equals( Object o1) {
		
		 Product o= (Product)o1;
		 if(this.review== o.review &&
				 this.price== o.price &&
				 this.brand == o.brand) {
			 return true;
		 }else {
			 return false;
		 }
	}
	
}
