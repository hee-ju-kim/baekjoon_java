
import java.util.Scanner;
import java.util.Stack;

public class Practice25556 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];
        try {
            for (int i = 0; i < input; i++) {
                arr[i] = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.println("e = " + e);
        } finally {
            sc.close();
        }

        Stack<Integer>[] stack = new Stack[4];
        for (int i = 0; i < stack.length; i++) {
            stack[i] = new Stack<>();
            stack[i].push(0);
        }

        for (int i = 0; i < input; i++) {
            boolean flag = false;
            for (int j = 0; j < stack.length; j++) {
                if (arr[i] > stack[j].peek()) {
                    stack[j].push(arr[i]);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}

// 포스택
// https://www.acmicpc.net/source/share/fd789db5f85b4d958e1fa240e2879432