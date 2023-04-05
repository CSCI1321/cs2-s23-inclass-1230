package cs2.generics;

import cs2.univ.Person;

public class Sorting {
  
  public static void bubbleSort (int[] a) {
    for(int i=0; i<a.length; i++) {
      for(int j=0; j<a.length-1; j++) {
        if(a[j] > a[j+1]) {
          int tmp = a[j];
          a[j] = a[j+1];
          a[j+1] = tmp;
        }
      }
    }
  }

  public static void main(String[] args) {
    
  }
}
