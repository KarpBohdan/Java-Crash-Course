public class Kata{
    public static String datingRange(int age) {
        int min;
        int max;
        if(age<=14){
            min=age - (int)(age*0.10);

            max=age + (int)(age*0.10);
        }
        else
        {
            min=age/2+7;
            max=(age-7)*2;
        }
        return min +"-"+ max;
    }
}