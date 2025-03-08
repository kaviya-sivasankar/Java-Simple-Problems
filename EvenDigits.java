
public class EvenDigits{


public static void main(String[] args){


int[] nums ={ 1,22,456,1234,11};

System.out.println(findNumber(nums));

}

//findNumber Function

static int findNumber(int[] nums) {

int count = 0;

for(int num : nums){
if(even(num)){
count++;
}
}
return count;
}



// count no of digits first


static int countDigits(int num){

int count = 0;

if(num == 0){

return 1;
}

if( num < 0){

num = num * -1;

}

while(num > 0){

count++;

num = num / 10;

}

return count;  // total count = 5

}

static boolean even(int num){

int numberOfDigits = countDigits(num);

if(numberOfDigits % 2 == 0){

return true;

}
return false;
}


}




