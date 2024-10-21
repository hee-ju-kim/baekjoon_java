import java.util.Scanner;

public class Main {
    static int k = 0;
    static int cnt = 0;

    public static void heapSort(int[] a) {
        int n = a.length - 1;
        buildMinHeap(a, n);
        for (int i = n; i >= 2; i--) {
            swap(a, 1, i);
            heapify(a, 1, i-1);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        cnt++;

        if(k == cnt) {
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < arr.length; i++) {
                sb.append(arr[i]).append(" ");
            }
            System.out.println(sb.toString());
            System.exit(0);
        }
    }

    public static void buildMinHeap(int[] a, int n) {
        for (int i = n / 2; i >= 1; i--) {
            heapify(a, i, n);
        }
    }

    public static void heapify(int[] a, int k, int n) {
        int left = 2 * k;
        int right = 2 * k + 1;
        int min;
        if (right <= n ) {
            if (a[left] < a[right]) {
                min = left;
            } else {
                min = right;
            }
        } else if (left <= n) {
            min = left;
        } else {
            return;
        }

        if(a[min] < a[k]) {
            swap(a, min, k);
            heapify(a, min, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();

        int[] a = new int[ n + 1];
        for (int i = 1; i < n + 1; i++) {
            a[i] = sc.nextInt();
        }

        sc.close();

        heapSort(a);
        System.out.println("-1");
    }
}