package practice;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("gadaga"));
    }
    public static boolean palindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
