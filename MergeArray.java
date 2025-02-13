//Merge 2 array and print in resultant array 

import java.util.ArrayList;

  public class MergeArray{

    public static void main(String[] args){

      int[] arr1 = {1,2,3};

      int[] arr2 = {4,5,6};

      ArrayList<Integer> result = new ArrayList<>();

   for(int i = 0; i < arr1.length; i++){

      result.add(arr1[i]);
  }

   for(int j = 0; j < arr2.length; j++){

      result.add(arr2[j]);
  }

      System.out.println(result);
  }
}