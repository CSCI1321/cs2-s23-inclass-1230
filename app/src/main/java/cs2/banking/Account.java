package cs2.banking;

public class Account {
	//Fields
	private int balance;
	private int num;
	private Customer owner;
	//Constructor
	public Account(Customer _owner, int _num, int _balance) {
		owner = _owner;
		num = _num;
		if(_balance > 0) {
			balance = _balance;
		} else {
			balance = 0;
		}
	}
	//Methods
	public boolean deposit(int amt) {
		if(amt > 0) {
			balance += amt;
			return true;
		} else return false;
	}
	public boolean withdraw(int amt) {
	  if(amt > 0 && amt < balance) {
			balance -= amt;
			return true;
		} else return false;
	}
	public int getBalance() {
		return balance;
	}
	/*
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		String[] pieces = newName.split(" ");
		if(pieces.length >= 2) {
			name = newName;
		}
	}*/

	public String toString() {
		return owner + ": $" + (balance / 100.0);
	}
}

class ATM {
  public static void main(String[] args) {
		System.out.println("Hello!");
		Customer sally = new Customer("Sally","Ride",9999999);
		Account x = new Account(sally, 123, -20099);
		Account y = new Account(sally, 532, 33333);
		/*
		x.setName("Oprah");
		System.out.println(x.getName());
		x.setName("Oprah Winfrey");
		System.out.println(x.getName());
		*/
		System.out.println(y);
		System.out.println(x.getBalance());
		System.out.println(x.deposit(10000));
		System.out.println(x.getBalance());
		System.out.println(x);
		System.out.println(x.withdraw(30000));
		System.out.println(x);
		System.out.println(x.deposit(-50000));
		System.out.println(x);
		System.out.println(x.withdraw(-1000000));
		System.out.println(x);
		//x.balance = 2500000;
		System.out.println(x);
	}
}


