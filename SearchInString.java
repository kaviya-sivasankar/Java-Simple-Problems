// Search  Character in String


public class SearchInString{

   public static void main(String[] args){

      String str = "kaviya";

      char target = 'k';

      System.out.println(searchString(str , target));

}

   static boolean searchString(String str ,char target){

      if(str.length() == 0){

         return false;
    }

     for(int i = 0 ; i < str.length(); i++){

      if(target == str.charAt(i)){

         return true;
    }
}

         return false;

    }
}