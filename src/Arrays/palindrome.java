package Arrays;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(palinSubString("helloellee"));
//        palinSubString("helloelle");
    }


    public static int palinSubString(String str ){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if(isPalindrome(str,i,j)){
                    count++;
                    System.out.print(str.substring(i,j+1));
                    System.out.print(" ");
                }
            }
        }

            return count;
    }
    public static boolean isPalindrome(String arr,int i,int j){

        while (i<j){
            if(arr.charAt(i)==arr.charAt(j)){
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
