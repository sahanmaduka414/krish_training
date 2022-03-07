import java.util.Scanner;

public class MissingNumber {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {

                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    static void missingnumber(int ar[], int size) {

        int a = 0,
                b = size - 1;
        int mid = 0;
        boolean flag= false;

        for (int i = 0; i < b; i++) {

            if(ar[i+1]-ar[i]==2){
                System.out.println("one number is missing");
            }else if(ar[i+1]-ar[i]==2){
                System.out.println("two number is missing");

            }


            if (ar[i+1]== ar[i]+1) {
                System.out.println(ar[i]);

            } else {
                System.out.println("Missing Number :"+ar[i]);

            }

        }


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("String Name :");
        String value = s.next();

        String[] splits = value.split(",");
        try {
            int[] numbers = new int[splits.length];
            if (splits.length >= 3) {
                for (int i = 0; i < splits.length; i++) {

                    numbers[i] = Integer.parseInt(splits[i]);
                }

                bubbleSort(numbers);

                int size = numbers.length;

                missingnumber(numbers, size);
                //               System.out.println("Missing Number :" + search);
            } else {
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("number format exception");
        }

    }

}
