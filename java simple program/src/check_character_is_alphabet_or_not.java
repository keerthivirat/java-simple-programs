public class check_character_is_alphabet_or_not {
    public static void main(String[] args) {
        char character='k';
        if(character>='a' && character<='z' || character>='A' && character<='z'){
            System.out.println(character + " is Alphabet ");
        }
        else
        {
            System.out.println(character +" is not Alphabet ");
        }
    }
}
