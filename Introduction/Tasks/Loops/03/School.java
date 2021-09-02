public class School{

    public static int getAverage(int[] marks){
        int averages=0;
        for(int i=0;i<marks.length;i++){
            averages+=marks[i];
        }
        averages/=marks.length;
            return averages;
    }

}