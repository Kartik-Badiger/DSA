package prec1;

public class Main {
    public static void main(String[] args) {
        Number num = new Number();
        System.out.println(num.display(456));
//        System.out.println(num.display("four five six"));
    }
     static class Number{
        Number(){

        }
        public String display(int n){
            String number=String.valueOf(n);
            String [] words= {"one","two","three","four","five","six","seven",
                    "eight","nine"};
            String[] numbers = number.split("");
            String sb = "";
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i].equals("one")){
//                    sb=sb.append(words[0]);
                    sb=sb+words[0];
                }
                if(numbers[i].equals("two")){
//                    sb=sb.append(words[1]);
                    sb=sb+words[1];
                }
                if(numbers[i].equals("three")){
//                    sb=sb.append(words[2]);
                    sb=sb+words[2];
                }
                if(numbers[i].equals("four")){
//                    sb=sb.append(words[3]);
                    sb=sb+words[3];
                }
                if(numbers[i].equals("five")){
//                    sb=sb.append(words[4]);
                    sb=sb+words[4];
                }
                if(numbers[i].equals("six")){
//                    sb=sb.append(words[5]);
                    sb=sb+words[5];
                }
                if(numbers[i].equals("seven")){
//                    sb=sb.append(words[6]);
                    sb=sb+words[6];
                }
                if(numbers[i].equals("eight")){
//                    sb=sb.append(words[7]);
                    sb=sb+words[7];
                }
                if(numbers[i].equals("nine")){
//                    sb=sb.append(words[8]);
                    sb=sb+words[8];
                }
                sb=sb+" ";
            }
            return sb;

        }
        public int display(String str){
            String [] numbers = str.split(" ");
            int[] nums={1,2,3,4,5,6,7,8,9};
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i]=="one"){
                    sb.append(nums[0]);
                }if(numbers[i]=="two"){
                    sb.append(nums[1]);
                }if(numbers[i]=="three"){
                    sb.append(nums[2]);
                }if(numbers[i]=="four"){
                    sb.append(nums[3]);
                }if(numbers[i]=="five"){
                    sb.append(nums[4]);
                }if(numbers[i]=="six"){
                    sb.append(nums[5]);
                }if(numbers[i]=="seven"){
                    sb.append(nums[6]);
                }
                if(numbers[i]=="eight"){
                    sb.append(nums[7]);
                }if(numbers[i]=="nine"){
                    sb.append(nums[8]);
                }
                sb.append(" ");
            }
//            return Integer.parseInt(String.valueOf(sb.toString()));
            return Integer.parseInt(String.valueOf(sb.toString()));

        }
    }



}
