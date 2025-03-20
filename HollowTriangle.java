public class HollowTriangle {
    public static void main(String[] args){
        int num = 5;
        for(int row=1; row<=num; row++){
for(int space = 1; space<=num-row; space++){
    System.out.print(" ");
}
for(int col = 1; col<= (row*2)-1; col++){
    if(col == 1 || col == row*2-1|| row == num){
    System.out.print("*");
    }
    else
    System.out.print(" ");
}
System.out.println();
        }
    }
}
