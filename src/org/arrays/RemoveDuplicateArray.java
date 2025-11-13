package org.arrays;
public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            // check if arr[i] already exists in temp
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[j++] = arr[i];
            }
        }

        // print result
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
