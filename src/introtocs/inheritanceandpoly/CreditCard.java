package introtocs.inheritanceandpoly;

public class CreditCard extends MoneyCard {
	
	private int creditLimit;
	
	public CreditCard(int amount) {
		this.balance = 0;
		this.creditLimit = amount;
	}
	
	public void makePayment(int amount) {
		this.balance = this.balance - amount;
	}
	
	public int getAvailableCredit() {
		return this.creditLimit - balance;
	}
	
	@Override
	public void makePurchase(int amount) {
		if(amount > this.getAvailableCredit()) {
			throw new IllegalArgumentException("Amount of the purchase exceeds available credit");
		}
		
		balance = balance + amount;
	}
}
