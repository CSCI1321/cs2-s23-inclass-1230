package cs2.banking;

public class Customer {
	private String first;
	private String last;
	private int ssn;

	public Customer(String f, String l, int s) {
		first = f;
		last = l;
		ssn = s;
	}

	public String toString() {
		return first + " " + last;
	}

}

