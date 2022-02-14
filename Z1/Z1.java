package Z1;

import java.time.LocalTime;

public class Z1 {
    public static void main(String[] args) {
        Integer[] sortedNumbers = {1, 2, 3};
        Integer[] unSortedNumbers1 = {3, 2, 1};
        Integer[] unSortedNumbers2 = {1, 1, 1};

        LocalTime[] sortedDates = {LocalTime.MIDNIGHT, LocalTime.NOON,
                LocalTime.MAX};
        LocalTime[] unSortedDates1 = {LocalTime.MIDNIGHT, LocalTime.MAX,
                LocalTime.MIN};
        LocalTime[] unSortedDates2 = {LocalTime.MIN, LocalTime.MIN,
                LocalTime.MIN};

        String[] sortedStrings = {"a", "b", "c"};
        String[] unSortedStrings1 = {"c", "b", "a"};
        String[] unsortedStrings2 = {"a", "a", "a"};

        System.out.println(ArrayUtil.isSorted(sortedNumbers));
        System.out.println(ArrayUtil.isSorted(unSortedNumbers1));
        System.out.println(ArrayUtil.isSorted(unSortedNumbers2));

        System.out.println();

        System.out.println(ArrayUtil.isSorted(sortedDates));
        System.out.println(ArrayUtil.isSorted(unSortedDates1));
        System.out.println(ArrayUtil.isSorted(unSortedDates2));

        System.out.println();

        System.out.println(ArrayUtil.isSorted(sortedStrings));
        System.out.println(ArrayUtil.isSorted(unSortedStrings1));
        System.out.println(ArrayUtil.isSorted(unsortedStrings2));

    }

    static class ArrayUtil {
        static <T extends Comparable<T>> String isSorted(T[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0)
                    return "Podana tablica nie jest " +
                            "uporządkowana niemalejąco.";
            }


            return "Podana tablica jest " +
                    "uporządkowana niemalejąco.";
        }

    }

}
