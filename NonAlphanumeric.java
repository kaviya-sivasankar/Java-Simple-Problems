// Remove non-alphanumeric character from a string and print resultant string

public class NonAlphanumeric{

 public static void main(String[] args){

    String name = "@kaviya08";

    String result ="";

  for(int i = 0; i<name.length(); i++){

    char ch =name.charAt(i);

  if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){

   result += ch;
  }

}

    System.out.print(result);
  }
}