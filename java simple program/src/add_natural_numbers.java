import java.util.Scanner;

public class add_natural_numbers {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=scanner.nextInt();
        int sum = 0;
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("the total sum is : "+sum );
    }
}



