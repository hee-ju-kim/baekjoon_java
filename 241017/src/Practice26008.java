import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice26008 {

    public static void main (String[] args) throws IOException {
        long answer = 1L;
        long mod = 1000000007;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] inputData = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int N = inputData[0];
        int M = inputData[1];

        for (int i = 0; i < N - 1; i++) {
            answer = (answer * M) % mod;
        }

        System.out.println(answer);

        br.close();
    }
}

// 해시 해킹
// http://boj.kr/31cfd4cd2d754306a70e737285ada17c