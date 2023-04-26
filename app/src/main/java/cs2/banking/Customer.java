package cs2.banking;

public class Customer implements Cloneable {
	private String first;
	private String last;
	private int ssn;

	public Customer(String f, String l, int s) {
		first = f;
		last = l;
		ssn = s;
	}

	@Override
	public Object clone() {
		return new Customer(first, last, ssn);
	}

	public String toString() {
		return first + " " + last;
	}

	public void changeName(String newLast) {
		last = newLast;
	}

}

