package Z2;

import java.util.*;

public class Z2 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        Vector<Integer> intVector = new Vector<>();
        intVector.add(1);
        intVector.add(2);
        intVector.add(3);

        Set<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);

        print(intList);
        System.out.println();
        print(intVector);
        System.out.println();
        print(intSet);

    }

    public static <E> void print(Iterator<E> object) {
        Iterator<E> iterator = object.iterator();

        while (true) {
            System.out.print("[" + iterator.next() + "]");

            if (iterator.hasNext())
                System.out.print(",");

            else
                break;

        }

    }

}
