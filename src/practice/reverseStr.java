package practice;

public class reverseStr {
    public static void main(String[] args) {
        System.out.println(reverse("kartik"));
    }
    public static String reverse(String str){
        String reversed="";
        for (int i = str.length()-1; i >=0; i--) {
            reversed=reversed+str.charAt(i);
        }
        return reversed;
    }
}
