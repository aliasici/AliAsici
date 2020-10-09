package Replit;

public class LastFirst {
    public static void main(String[] args) {

        int[] i = {1, 2, 3, 4, 5};

        int last = i.length-1;

        int first = i[0]; // 1

        i[0] = i[i.length-1]; //4

        i[last] = first;
        

    }
}
