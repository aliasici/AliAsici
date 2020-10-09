package Replit;
/*
getDup(["1","2","aa"',"1", "aa"])
returns:4 ("1" is duplicated and there are two "1"s
           and 2 "aa"s so return is 4)


 */

public class ArraysGetDublicates {
    public static void main(String[] args) {

        String[] str = {"1","2","aa","1", "aa"};

        String result= "";
        int count = 0;

        for (int i = 0; i < str.length-1; i++)
        {
            for (int j = i+1; j < str.length; j++)
            {
                if( (str[i].equals(str[j])) && (i != j) )
                {
                    System.out.println( "\""+(str[j]+"\"" + " is duplicated and there are two " + "\""+str[j]+"\"" + "s so return is 2"));
                }
            }
        }

    }

//       if(str.contains(each)){
//        str += each;
//        System.out.println(npnDup);
//


}
