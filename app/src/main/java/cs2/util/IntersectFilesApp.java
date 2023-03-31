package cs2.util;

import java.util.Scanner;
import java.io.File;

public class IntersectFilesApp {
  public static void printIntersection(String[] a, String[] b) {
    //Also want to print out the number of intersecting words, we can do this 2 ways:
    //1 - We can do a pass that counts, and then a second pass that prints
    int count = 0;
    for(int i=0; i<a.length; i++) {
      for(int j=0; j<b.length; j++) {
        if(a[i].equalsIgnoreCase(b[j])) {
          count++;
        }
      }
    }
    System.out.println(count);
    for(int i=0; i<a.length; i++) {
      for(int j=0; j<b.length; j++) {
        if(a[i].equalsIgnoreCase(b[j])) {
          System.out.println(a[i]);
        }
      }
    }

    /* 
    //OR
    //2 - We can construct an array of all the words in the intersection, and 
    //    then print the length of the array, and then the words
    //  The tricky part here is that the array can't change size without
    //  making an entirely new array that's larger each time
    String[] isect = new String[0];
    for(int i=0; i<a.length; i++) {
      for(int j=0; j<b.length; j++) {
        if(a[i].equalsIgnoreCase(b[j])) {
          //Allocate a temporary array with one more slot, and copy everything over
          String[] temp = new String[isect.length+1];
          for(int k=0; k<isect.length; k++) {
            temp[k] = isect[k];
          }
          //Then you can add the new word
          temp[isect.length] = a[i];
          isect = temp;
        }
      }
    }
    System.out.println(isect.length);
    for(int i=0; i<isect.length; i++) {
      System.out.println(isect[i]);
    }
    */
  }

  public static void main(String[] args) {
    try {
      File file1 = new File(args[0]);
      File file2 = new File(args[1]);
      Scanner fin1 = new Scanner(file1);
      Scanner fin2 = new Scanner(file2);
      int num1 = fin1.nextInt();
      int num2 = fin2.nextInt();
      fin1.nextLine();
      fin2.nextLine();
      String[] dict1 = new String[num1];
      String[] dict2 = new String[num2];
      for (int i = 0; i < num1; i++) {
        dict1[i] = fin1.nextLine();
      }
      for (int i = 0; i < num2; i++) {
        dict2[i] = fin2.nextLine();
      }
      fin1.close();
      fin2.close();
      printIntersection(dict1, dict2);
    } catch(Exception ex) {
      System.out.println("Error: " + ex.getMessage());
    }
  }  
  
}
