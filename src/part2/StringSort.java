package part2;

public class StringSort {
    private String o = "abcdefg";
    private String a = "abcdef";

    String middleStringElemDivisible(String a){
        int stringLength = a.length();
        char [] chars = a.toCharArray();
        String b = null;
            if (chars.length % 2 ==0){
                int v = (stringLength/2) - 1;
                int c = (stringLength/2) + 1;
                b = a.substring(v, c);
            }
        return b;
    }

    String middleStringElemInDivisible(String o){
        int stringLength = o.length();
        char [] chars = o.toCharArray();
        String q = null;
        if (chars.length % 2 != 0){
            int v = (stringLength/2);
            int c = (stringLength/2) + 1;
            q = o.substring(v,c);
        }
        return q;
    }

    public static void main(String[] args) {
        StringSort stringSort = new StringSort();
        System.out.println(stringSort.middleStringElemDivisible(stringSort.a));
        System.out.println(stringSort.middleStringElemInDivisible(stringSort.o));
    }
}
