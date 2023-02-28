import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the first string");
        String original= scanner.nextLine();

        //it will store the reverse string
        String reversestring="";

        //it is length the original string
        int strlength=original.length();
        System.out.println(strlength);

        for(int i =strlength-1;i>=0;i--){
            reversestring=reversestring+original.charAt(i);
        }
        System.out.println("the reverse string is :"+reversestring);

        if (original.equals(reversestring)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }


    }
}
