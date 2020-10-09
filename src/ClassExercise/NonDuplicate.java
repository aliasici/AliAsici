package ClassExercise;

public class NonDuplicate {
    public static void main(String[] args) {

        String str = "ablak";
        String str2 =removeDup(str);

        System.out.println(str2);

        String str3 = reverse(str);
        System.out.println(str3);
        
    }

    public static String removeDup(String str){

        String nonDup = "";
        for(String each : str.split("")){

            if(!nonDup.contains(each)){
                nonDup += each;
            }
        }

        return nonDup;

    }
    public static String reverse(String str){
        String reverse ="";
        for(int i = str.length()-1; i>=0; i--){
            reverse += ""+ str.charAt(i);
        }
        return reverse;
    }
}
