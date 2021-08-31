public class Kata {

    public static int toBinary(int n) {
        int s=1;
        if(n!=1){
            s=n%2;
            n=toBinary(n/2);
        }
        else{n=0;}
        n=n*10+s;
        return n;
    }

}