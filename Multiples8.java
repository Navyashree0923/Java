package Assignment2;

class Multiples8 {

        static int ans[];
        static void countSieve(int arr[], int n)
        {
            int MAX = arr[0];
            for (int i = 1; i < n; i++)
                MAX = Math.max(arr[i], MAX);

            int cnt[] = new int[MAX + 1];
            ans = new int[MAX + 1];

            for (int i = 0; i < n; ++i)
                ++cnt[arr[i]];
            for (int i = 1; i <= MAX; ++i)
                for (int j = i; j <= MAX; j += i)
                    ans[i] += cnt[j];
            return;
        }

        static int countMultiples(int k)
        {
            return ans[k];
        }
        public static void main(String args[])
        {
            int arr[] = { 5, 45, 23, 63, 27, 80, 15, 2, 65, 30};
            int n = 10;
            countSieve(arr, n);
            int k = 5;
            System.out.println(countMultiples(k));
        }
    }

