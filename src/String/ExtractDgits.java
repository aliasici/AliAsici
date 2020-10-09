package String;

public class ExtractDgits {
    public static void main(String[] args) {
        String str = "aa2aa3";
        String result = "";
        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            char each = str.charAt(i); // a 1 b 2 c 3
            if(each >= 48 && each <= 57){ // if the char is between 48-57, then it is digit
                sum += Integer.parseInt("" + each); // covert the char to Integer then add it to the sum
                result += "" + Integer.parseInt("" + each);
            }
        }
        System.out.println(sum);
        System.out.println(result);
    }
}
