package Assignment2;
import java.io.*;
 class SortOddEven12 {
        static void segregateEvenOdd(int arr[])
        {
            int left = 0, right = arr.length - 1;
            while (left < right)
            {
                while (arr[left]%2 == 0 && left < right)
                    left++;
                while (arr[right]%2 == 1 && left < right)
                    right--;
                if (left < right)
                {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
        }
        public static void main (String[] args)
        {
            int arr[] = {3, 8, 5, 13, 6, 12, 18, 5};
            segregateEvenOdd(arr);
            System.out.print("Array after segregation ");
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i]+" ");
        }
    }

