package com.mycompany.app;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class App
{
    public static boolean search(ArrayList<Integer> array, int e) {
      System.out.println("inside search");
      if (array == null) return false;

      for (int elt : array) {
        if (elt == e) return true;
      }
      return false;
    }

    public static void main(String[] args) {
      
    }
}
