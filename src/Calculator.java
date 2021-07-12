public class Calculator {
    private int [] myArray = new int[4];
    int plus(int a,int b){
        return a + b;
    }

    double multiply(double a,double b){
        return a * b;
    }

    int plus(int [] myArray) {
        int sum = 0;
        for (int j : myArray) {
            sum = sum + j;
        }
        System.out.println(sum);
        return sum;
    }
}
