public class Kata{

    public static int grow(int[] x){
        int mul=1;
        for(int i=0; i<x.length;i++){
            mul*=x[i];
        }
        return mul;

    }

}