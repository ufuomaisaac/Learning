public class homew {
    public static void main(String[] args){
        int num = 2678;
        StringBuilder userOutput = intToRoman(num);
        System.out.println(userOutput);
    }
    public static StringBuilder intToRoman(int userInput) {
        StringBuilder sb = new StringBuilder();
        while (userInput > 0) {
            if (userInput >= 1000) {
                userInput -= 1000;
                sb.append('M');
            } else if (userInput >= 900 ){
                userInput -= 900;
                sb.append("CM");
            } else if (userInput >= 500 ){
                userInput -= 500;
                sb.append('D');
            } else if (userInput >= 400){
                userInput -= 400;
                sb.append("CD");
            } else if (userInput >= 100){
                userInput -= 100;
                sb.append('C');
            } else if (userInput >= 90){
                userInput -= 90;
                sb.append("XC");
            } else if (userInput >= 50){
                userInput -= 50;
                sb.append('L');
            } else if (userInput >= 40){
                userInput -= 40;
                sb.append("XL");
            } else if (userInput >= 10){
                userInput -= 10;
                sb.append('X');
            } else if (userInput >= 9){
                userInput -= 9;
                sb.append("IX");
            } else if (userInput >= 5){
                userInput -= 5;
                sb.append('V');
            } else if (userInput >= 4){
                userInput -= 4;
                sb.append("IV");
            } else if (userInput >= 1){
                userInput -= 1;
                sb.append("I");
            }
        }
        return sb;
    }

}
