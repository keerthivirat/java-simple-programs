/*
prime number => a number thatbis divisible only by 1 and itself
the divisor of prime is always 1 an itself
if we get the divisor of a number exactly 2 then it is prime number
example : 2,3,5,7,11,13,,
*/

public class PRIME_NUMBER {
    public static void main(String[] args) {
        int num= 6;
        int count=0;
        for(int i=1;i<=num;i++){
            if(num % i== 0){
                count++;
            }

        }
        if (count==2){
            System.out.println(num + " this is prime number ");
        }
        else {
            System.out.println(num + " not a prime number ");
        }

    }
}
