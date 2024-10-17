import java.util.LinkedList;
import java.util.Scanner;

public class Practice1021 {
    public static void main(String[] arg) {
        LinkedList<Integer> queue = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(); // 총길이

        int input = sc.nextInt();    // 뽑아낼갯수
        int[] arr = new int[input];     // 뽑아낼 숫자

        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < len; i++) {
            queue.offer(i + 1);
        }

        int cnt = 0; // 연산 횟수
        int i = 0;
        while (i < input) {
            int queueIndex = queue.indexOf(Integer.valueOf(arr[i]));
            int halfIndex = queue.size() / 2;

            if (queueIndex == 0) {
                // 맨앞 삭제
                i++;
                queue.pollFirst();
            } else if (halfIndex >= queueIndex) {
                // 중간지점보다 앞에있는경우 앞의것을 뒤로보냄
                int tmp = queue.pollFirst();
                queue.offer(tmp);
                cnt++;
            } else {
                // 중간지점보다 뒤에있는경우 뒤에있는것을 앞으로보냄
                int tmp = queue.pollLast();
                queue.offerFirst(tmp);
                cnt++;
            }
        }


        System.out.println(cnt);
    }
}

// 회전하는 큐
// http://boj.kr/7829c891889d4a16aaa4d4bed52e2f30