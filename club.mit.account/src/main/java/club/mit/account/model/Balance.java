package club.mit.account.model;

public class Balance {
	private long balance;
	private boolean locked;
	@Override
	public String toString() {
		return "Balance [balance=" + balance + ", locked=" + locked + "]";
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
}
