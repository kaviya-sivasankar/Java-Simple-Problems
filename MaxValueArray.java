// Maximum value of an array

public class MaxValueArray{
  
  public static void main(String[] args){
     
     int[] arr = {1,44,78,18,5};

       System.out.print(max(arr));
}

 static int max(int[] arr){

     int maxval = arr[0];

   for(int i =1; i < arr.length; i++){

   if(arr[i] > maxval)

      maxval = arr[i];
  }
  
   return maxval;
  }

}
