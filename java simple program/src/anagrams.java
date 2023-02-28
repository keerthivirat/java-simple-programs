import java.util.Arrays;
import java.util.Scanner;

public class anagrams {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the first string: ");
        String Fstr=scanner.nextLine();

        System.out.println("enter the second string:");
        String sstr=scanner.nextLine();

        char[] letterin1ststring=Fstr.toCharArray();
        char[] letterin2ndstring=sstr.toCharArray();

        Arrays.sort(letterin1ststring);
        Arrays.sort(letterin2ndstring);

        boolean result = Arrays.equals(letterin1ststring,letterin2ndstring);

        if (Fstr.length()==sstr.length()) {
            if (result == true) {
                System.out.println(Fstr + " and " + sstr + "are anagrams");
            } else {
                System.out.println(Fstr + " and " + sstr + "are not anagrams length are same");

            }
        }
            else {
                System.out.println(Fstr+"and"+sstr+"are not anagrams");
            }
        }
    }

