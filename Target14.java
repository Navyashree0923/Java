package Assignment2;

class Target14 {
        static void printPairs(int arr[],
                               int n, int sum)
        {
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++)
                    if (arr[i] + arr[j] == sum)
                        System.out.println("(" + arr[i] + ", " + arr[j] + ")");
        }

        public static void main(String[] arg)
        {
            int arr[] = { 3, 1, 11, 2, 9, 7, 4, 5, -1, 13, 6};
            int n = arr.length;
            int target= 8;
            printPairs(arr, n, target);
        }
    }

