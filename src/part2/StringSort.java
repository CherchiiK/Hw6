package part2;

public class StringSort {
    private String o = "abcdefg";
    private String a = "abcdef";

    String middleStringElemDivisible(String a){
        char [] chars = a.toCharArray();
        String b = null;
            if (chars.length % 2 ==0){
                int v = (chars.length/2) - 1;
                int c = (chars.length/2) + 1;
                b = a.substring(v, c);
            }
            else if (chars.length % 2 != 0){
                int v = (chars.length/2);
                int c = (chars.length/2) + 1;
                b = o.substring(v,c);
            }
        return b;
    }

    String arrayReplacing(String a){
        char [] chars = a.toCharArray();
        String k,m,z,w;
        String b = null;
        if (chars.length % 2 ==0){
            int v = (chars.length/2);
            int c = (chars.length/2);
            k = a.substring(0, c);
            m = a.substring(v, chars.length);
            b = m + k;
        }
        else if (chars.length % 2 != 0){
            int y = (chars.length/2);
            z = o.substring(0,y);
            m = o.substring(y, y+1);
            w = o.substring(y+1, chars.length);
            b = w+ m + z;
        }
        return b;
    }



    public static void main(String[] args) {
        StringSort stringSort = new StringSort();
        System.out.println(stringSort.middleStringElemDivisible(stringSort.a));
        System.out.println(stringSort.middleStringElemDivisible(stringSort.o));
        System.out.println(stringSort.arrayReplacing(stringSort.a));
        System.out.println(stringSort.arrayReplacing(stringSort.o));
    }
}
