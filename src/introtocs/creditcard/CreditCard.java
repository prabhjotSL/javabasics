package introtocs.creditcard;

public class CreditCard {
	private int creditLimit;
	private int balance;
	private String cardholder;
	private int purchases;
	
	/**
	 * Constructs a credit card with a predetermined credit limit and
	 * the provided cardholder name.
	 * 
	 * @param name the cardholders name
	 */
	public CreditCard(String name) {
		this.creditLimit = 500;
		this.balance = 0;
		this.cardholder = name;
		this.purchases = 0;
	}
	
	/**
	 * Constructs a credit card with the provided name and credit limit.
	 * 
	 * @param name the cardholders name
	 * @param amount the amount of the credit limit
	 */
	public CreditCard(String name, int amount) {
		this.creditLimit = amount;
		this.balance = 0;
		this.cardholder = name;
		this.purchases = 0;
	}
	
	/**
	 * Gets the credit limit of the credit card
	 * 
	 * @return the credit limit
	 */
	public int getCreditLimit() {
		return this.creditLimit;
	}
	
	/**
	 * Gets the balance of the credit card
	 * 
	 * @return the balance
	 */
	public int getBalance() {
		return this.balance;
	}
	
	/**
	 * Gets the cardholder
	 * @return the cardholder
	 */
	public String getCardholder(){
		return this.cardholder;
	}
	
	/**
	 * Makes a purchase increasing the balance of the credit card.
	 * 
	 * @param amount the amount of the purchase
	 */
	public void makePurchase(int amount) {
		int availableCredit = this.creditLimit - this.balance;
		if(availableCredit < amount) {
			this.balance = this.balance + amount + 50;
		}
		else {
			this.balance = this.balance + amount;
			this.purchases++;
		}
	}
	
	/**
	 * Makes a payment decreasing the balance of the credit card.
	 * 
	 * @param amount the amount of the payment
	 */
	public void makePayment(int amount) {
		this.balance = this.balance - amount;
	}
	
	/**
	 * Calculates the number of reward points earned
	 * @return the number of reward points
	 */
	public int calculateRewardPoints() {
		int points = 0;
		
		for (int i=0; i<this.purchases; i++) {
			points = points + 100;
		}
		
		return points;
	}
}