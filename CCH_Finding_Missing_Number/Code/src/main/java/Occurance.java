import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("String Name :");
        String name = s.nextLine();
        String toLowerCase = name.toLowerCase();
        occurance(toLowerCase);

    }

    public static void occurance(String message) {

        String replaceAll = message.replaceAll(" ", "");


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < replaceAll.length(); i++) {

            if (!sb.toString().contains(String.valueOf(replaceAll.charAt(i)))) {
                sb.append(String.valueOf(replaceAll.charAt(i)));
            } else {

            }
        }

        char[] msgChar = sb.toString().toCharArray();
        char[] msgChar1 =replaceAll.toCharArray();

        bubblesort(msgChar);


        for (int i = 0; i < sb.length(); i++) {
            int count =0;
            for (int j = 0; j < replaceAll.length(); j++) {

                if(msgChar[i]==msgChar1[j]){

                    count++;
                }

            }
            System.out.println(msgChar[i]+" - " + count+"\n");
        }

    }

    public static char[] bubblesort(char[] i) {
        char n = (char) i.length;


        for (int j = 0; j < (n - 1); j++) {
            for (int k = 0; k < n - j - 1; k++) {
                if (i[k] > i[k + 1]) {
                    int temp = i[k];
                    i[k] = i[k + 1];
                    i[k + 1] = (char) temp;

                }
            }
        }
        return i;
    }
}
