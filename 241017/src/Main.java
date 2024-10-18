import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int index = sc.nextInt();

        sc.close();

        LinkedList<Integer> ll = IntStream.rangeClosed(1, cnt)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));;

        StringBuffer sb = new StringBuffer();
        sb.append("<");
        int i = 0;
        while(ll.size() > 1) {
            i = (i + index - 1) % ll.size();
            sb.append(ll.remove(i)).append(", ");
        }
        sb.append(ll.remove()).append(">");
        System.out.println(sb);
    }
}