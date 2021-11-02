import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private Random random;
    private int min;
    private int max;
    private List<Integer> list = new ArrayList<>();

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int next = 0;

            @Override
            public boolean hasNext() {
                random = new Random();
                list.add(random.nextInt((max - min) + 1) + min);
                return next < list.size();
            }

            @Override
            public Integer next() {
                int ans = list.get(next++);
                return ans;
            }
        };
    }


}