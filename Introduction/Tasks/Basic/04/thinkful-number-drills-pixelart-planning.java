public class Kata {

    public static boolean isDivisible(int wallLength, int pixelSize) {
        boolean i;
        if(wallLength % pixelSize ==0){i=true;}
        else{i=false;}
        return i;
    }

}