package practice;

import java.util.Arrays;

public class reverse_charactersofWords_inSentence {
    public static void main(String[] args) {
        System.out.println(reverse("vinay bhat"));
    }
    public static String reverse(String str){
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder("");
        for (int i = 0; i < words.length; i++) {
            reversed.append(reversestr(words[i]));
            reversed.append(" ");
        }
        return reversed.toString();
    }
    public static String reversestr(String str){
        String reversed="";
        for (int i = str.length()-1; i >=0; i--) {
            reversed=reversed+str.charAt(i);
        }
        return reversed;
    }


}
