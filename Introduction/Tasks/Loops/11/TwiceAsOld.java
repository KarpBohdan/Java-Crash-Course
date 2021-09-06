public class TwiceAsOld{

    public static int TwiceAsOld(int dadYears, int sonYears){
        if((dadYears -sonYears*2)>0) return dadYears -sonYears*2;
        else return -(dadYears -sonYears*2);
    }

}