package introtocs.creditcard;

import java.util.ArrayList;

public class CreditCardTester {

	public static void main(String[] args) {
		// Collection of CreditCards
		ArrayList<CreditCard> cards = new ArrayList<CreditCard>();
		
		// Our Credit Card Objects
		CreditCard card1 = new CreditCard("Ricky Lamba", 2500);
		CreditCard card2 = new CreditCard("Shabad Lamba", 1400);
		CreditCard card3 = new CreditCard("Angad Lamba", 750);
		
		// Credit Card Purchases
		card1.makePurchase(1000);
		card1.makePurchase(1500);
		
		card2.makePurchase(200);
		card2.makePurchase(400);
		card2.makePurchase(150);

		card3.makePurchase(900);
		
		// Credit Card Payments
		card1.makePayment(50);
		card2.makePayment(25);
		card3.makePayment(75);
		
		// Add Credit Cards to cards ArrayList
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		
		// Printing our Credit Card information
		for (CreditCard card : cards) {
			System.out.println("The cardholder is: " + card.getCardholder());
			System.out.println("Total Credit Limit: " + card.getCreditLimit());
			System.out.println("Total Balance: " + card.getBalance());
			System.out.println("Total Reward Points: " + card.calculateRewardPoints());
			System.out.println("----------------------------------------------");
			
			
		}
		
	}

}
