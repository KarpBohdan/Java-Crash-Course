public class Kata{
    public static String bonusTime(final int salary, final boolean bonus) {
        int rez;
        if(bonus){
            rez=salary*10;
        }
        else rez=salary;
        return "£"+rez;
    }
}