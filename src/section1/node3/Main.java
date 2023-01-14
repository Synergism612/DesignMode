package section1.node3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    static void list() {
        System.out.println("集合");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<Integer> odds = new ArrayList<>();
        for (Integer val : list) {
            if (val % 2 == 0) {
                odds.add(val);
            }
        }
        for (Integer val : odds) {
            System.out.print(val);
        }
        System.out.println("\n结束");
    }

    static void stream() {
        System.out.println("流");
        IntStream
                .range(0, 10)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::print);
        System.out.println("\n结束");
    }

    public static void main(String[] args) {
        Main.list();
        Main.stream();
    }
}
