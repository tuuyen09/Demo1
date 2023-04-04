package ReveserseArray;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (var i : arr) {
            stack.push(i);
        }
        for (var i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));


        Stack<Character> stack1 = new Stack<>();
        String str = "abcde";
        char[] array = str.toCharArray();
        for (var i : array){
            stack1.push(i);
        }
        for (var i = 0; i< array.length; i++){
            array[i] = stack1.pop();
        }
        System.out.println(Arrays.toString(array));

    }

}
