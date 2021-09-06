public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum=0;
        for(int i=0;i<classPoints.length;i++){
            sum=classPoints[i];
        }
        sum+=yourPoints;
        sum/=classPoints.length+1;
        if(sum<yourPoints)return true;
        else return false;
    }
}