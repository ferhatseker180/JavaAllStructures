package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.collections.queue_interface;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMain {
    public static void main(String[] args) {
        // Queue ile aynı mantıkla çalışır ancak bu yapıda eğer istenilirse özel bir çalışma kuyruğu oluşturulabilir.

        Comparator<Integer> compareForEven = new Comparator<>() {
            public int compare(Integer i, Integer j) {
                int result = i % 2 - j % 2;
                if (result == 0)
                    result = i - j;
                return result;
            }
        };
        Queue<Integer> que = new PriorityQueue<>(20, compareForEven);

       // que.add(5);
       // que.add(10);
       // que.add(20);
       // que.add(15);

        for (int i = 0; i < 20; i++) {
            que.offer(20 - i);
        }

        for (int i = 0; i < 20; i++) {
            System.out.print("\t" + que.poll());
        }
        // Output: 2	4	6	8	10	12	14	16	18	20	1	3	5	7	9	11	13	15	17	19
    }
}
