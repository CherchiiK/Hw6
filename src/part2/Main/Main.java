package part2.Main;

import part2.StringSort;

public class Main {
    public static void main(String[] args) {
        StringSort stringSort = new StringSort();
        System.out.println(stringSort.middleStringElemDivisible(stringSort.a));
        System.out.println(stringSort.middleStringElemDivisible(stringSort.o));
        System.out.println(stringSort.arrayReplacing(stringSort.a));
        System.out.println(stringSort.arrayReplacing(stringSort.o));
    }
}
