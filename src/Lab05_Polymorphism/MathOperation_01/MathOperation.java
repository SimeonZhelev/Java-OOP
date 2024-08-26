package Lab05_Polymorphism.MathOperation_01;

public class MathOperation {

    public int add(int a, int b){
     return this.add(new int[] {a,b});
    }
    public int add(int a, int b, int c){
        return this.add(new int[]{a, b, c});
    }
    public int add(int a, int b, int c, int d){
        return this.add(new int[]{a, b, c, d});
    }
    private int add (int... params){
        int res = 0;

        for (int param : params) {
            res += param;
        }
        return res;
    }
}
