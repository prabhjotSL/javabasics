package introtocs.inheritanceandpoly;

public class MoneyCard {

	protected int balance;
	
	public int getBalance() {
		return this.balance;
	}
	
	public void makePurchase(int amount) {
		if(amount > this.balance) {
			throw new IllegalArgumentException("Amount of the purchase exceeds the balance");
		}
		
		this.balance = this.balance - amount;
	}
}
