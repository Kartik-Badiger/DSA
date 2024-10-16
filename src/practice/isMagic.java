package practice;

public class isMagic {
    public static void main(String[] args) {

        System.out.println(isLeapYear(1900));
    }
    public static void isMagic(int a,int b){
        if(a==b){
            if(isPerfectSquare(a)){
                System.out.println("Magic");
            }
            else {
                System.out.println("Not Magic");
            }
        }
    }

    private static boolean isPerfectSquare(int a) {
        if(a>=0){
            int x= (int) Math.sqrt(a);
            return x*x==a;
        }
        return false;
    }
    static boolean isLeapYear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }
            }
        }
        return false;
    }
}
