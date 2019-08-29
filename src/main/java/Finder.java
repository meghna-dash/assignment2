import java.lang.reflect.Array;
import java.util.Scanner;

public class Finder {
    public static void main(String args[])
    {
        int[] userArray = userInput();

            getMaxInArray(userArray);
            getMinInArray(userArray);
    }

    public static int[] userInput(){
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int num = input.nextInt();
        int array[] = new int[num];
        if(num > 0) {
            System.out.println("Enter the " + num + " numbers now.");

            for (int i = 0 ; i < array.length; i++ ) {
                array[i] = input.nextInt();
            }

            input.close();
            System.out.println("These are the numbers you have entered.");
            printArray(array);
        } else {
            System.out.println("The array must contain at lease one value.");
            userInput();
        }
        return array;
    }

    public static void printArray(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static Integer getMaxInArray(int array[]){
        if (array != null) {
            if (array.length > 0) {
                int max = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                    }
                }
                System.out.println("The largest element in given array: " + max);
                return max;
            } else return null;
        } else return null;
    }

    public static Integer getMinInArray(int array[]){
        if (array != null) {
            if (array.length > 0) {
                int min = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < min) {
                        min = array[i];
                    }
                }
                System.out.println("The smallest element in given array: " + min);
                return min;
            } else return null;
        } else return null;
    }
}
