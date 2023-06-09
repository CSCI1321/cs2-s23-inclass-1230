package cs2.univ;
import java.util.*;
public class PeopleTester {
	public static void main(String[] args) {
		Faculty me = new Faculty("Matt","Hibbs","mhibbs","CSI 270K");
		Student you = new Student("Sally","Ride","sride");
		System.out.println("I am " + me);
		System.out.println("You are " + you);

		Person[] peopleArray = { me, you };
		for(Person p : peopleArray) {
			System.out.println(p);
		}

		ArrayList<Person> people = new ArrayList<Person>();
		people.add(me);
		people.add(you);
		
		for(Person p : people) {
			System.out.println(p);
		}

		System.out.println(me.getSalary());
		me.pay();
		StudentWorker miley = new StudentWorker("Cyrus", "Miley", "hmontan");
		miley.pay();

		Payable[] payees = { me, miley };
		for(Payable p : payees) { p.pay(); }

	}
}
