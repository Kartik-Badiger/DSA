package practice;

public class reverse_words_in_sentence {
    public static void main(String[] args) {
        System.out.println(reverse("vinay bhat"));
    }
    public static String reverse(String str){
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder("");
        for (int i = words.length-1; i >=0; i--) {
            reversed.append(words[i]);
            reversed.append(" ");
        }

        return reversed.toString();
    }
}
