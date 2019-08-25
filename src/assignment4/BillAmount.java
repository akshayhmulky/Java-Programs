package assignment4;

public class BillAmount {

	public static void main(String[] args) {

	int billId=1001, custId=101, discount=2;
	double billAmount=199.99, billamount=0; 
		
	billamount = billAmount - (billAmount * ((double)discount/100));
		

	System.out.println("Bill id: "+billId);
	System.out.println("Customer id: "+custId);
	System.out.println("Discount: "+ discount);
	System.out.println("Bill Amount: "+billAmount);
	System.out.format("Discounted bill amount: %.2f", billamount);
	
	}

}
