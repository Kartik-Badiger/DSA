package practice;

public class isPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(19));
    }
    private static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if(n%i==0){

                return false;
            }
        }
        return true;
    }
}
