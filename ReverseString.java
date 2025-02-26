//Reverse a String 

public class ReverseString{

public static void main(String[] args){

String name = "kaviya";

char[] ch = name.toCharArray();         // String reverse = ""

for(int i = ch.length-1; i>=0; i--){     //name.length()-1

System.out.print(ch[i]);               //reverse = reverse + charAt(i);

}

}
}

                                     //str = String.valueOf(ch);

                                     //sysout(ch)