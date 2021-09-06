package Assignment2;
import java.io.*;
class Triplets15 {
        static void findTriplets(int arr[],
                                 int n, int target)
        {
            for (int i = 0;
                 i < n - 2; i++) {
                for (int j = i + 1;
                     j < n - 1; j++) {
                    for (int k = j + 1;
                         k < n; k++) {
                        if (arr[i] + arr[j] + arr[k] == target) {
                            System.out.println(
                                    arr[i] + " " + arr[j]
                                            + " " + arr[k]);
                        }
                    }
                }
            }
        }
        public static void main(String[] args)
        {
            int arr[] = { 3, 1, 2, 9, 7, 5, -1, 6};
            int n = arr.length;
            findTriplets(arr, n, 9);
        }
    }

