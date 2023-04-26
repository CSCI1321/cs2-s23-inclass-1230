package cs2.cloning;

import java.util.ArrayList;

import cs2.banking.Account;
import cs2.banking.Customer;

public class CloneTest {
  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("Hello");
    arr.add("Goodbye");
    arr.add("You");
    System.out.println(arr);

    ArrayList<String> alias = arr;
    //Changing alias also changes arr
    alias.set(1, "Adios");
    System.out.println(arr);

    ArrayList<String> clone = (ArrayList<String>)arr.clone();
    //Changing clone does NOT change arr
    clone.set(0, "Hola");
    System.out.println(arr);

    Account a = new Account(new Customer("Mae", "Jemison", 0), 1111, 100);
    Account b = new Account(new Customer("Sally", "Ride", 0), 2222, 400);
    ArrayList<Account> accts = new ArrayList<Account>();
    accts.add(a);
    accts.add(b);
    System.out.println(accts);

    ArrayList<Account> copy = (ArrayList<Account>)accts.clone();
    for(int i=0; i<copy.size(); i++) {
      copy.set(i, (Account)accts.get(i).clone());
    }
    copy.get(0).deposit(200);
    copy.get(0).owner.changeName("West");
    System.out.println(accts);

  }
}
