import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice10818 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int[] arr = new int[input];
//
//        int min = 0;
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//            if (i == 0) {
//                min = arr[i];
//                max = arr[i];
//            }
//
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//        }
//
//        sc.close();

//        int min = Arrays.stream(arr).min().getAsInt();
//        int max = Arrays.stream(arr).max().getAsInt();

//        int min = 0;
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0) {
//                min = arr[i];
//                max = arr[i];
//            }
//
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//        }

//        Arrays.sort(arr);
//        int min = arr[0];
//        int max = arr[arr.length - 1];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());	//첫 줄 N 은 안쓰이므로 입력만 받는다.
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(st.hasMoreTokens()) {
            int val = Integer.parseInt(st.nextToken());
            if(val>max) {
                max = val;
            }
            if(val<min) {
                min = val;
            }
        }
        System.out.println(min + " " + max);

//        System.out.printf("%d %d", min, max);
    }
}

// 최소, 최대
// http://boj.kr/61e2e4000e304a958deeaf0eb2adf66c