package com.makepayment;

public class PaymentProcessing {

	public static void main(String[] args) 
	{
		
		
		//Payment p=new CreditCardPayment();
		//Payment p1=new DebitCardPayment();
		//Payment p2=new UPIPayment();
	//	paymentGateway(p,p1,p2);
		
		
	}
	public static void paymentGateway(Payment ...payments)
	{
	for (Payment payment : payments)
		{
			payment.processPayment();
			
		}
	}
	

}
