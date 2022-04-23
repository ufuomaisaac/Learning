public class isPalindrome {
   public static void main(String [] args){
       String sb = addBinaryNumbers("1000", "11");
       System.out.println(sb);
   }
   public static String addBinaryNumbers(String in1, String in2){
       StringBuilder sb = new StringBuilder();
       int i = in1.length() - 1;
       int j = in2.length() - 1;
       int carry = 0;

       while (i >= 0 || j >= 0){
           int sum = carry;
           if (i >= 0) sum += in1.charAt(i) - '0';
           if (j >= 0) sum += in2.charAt(j) - '0';
           carry = sum / 2;
           sb.append(sum % 2);
           i--;
           j--;
       }
       if (carry != 0){
           sb.append(carry);
       }
       return sb.reverse().toString();
   }

}
