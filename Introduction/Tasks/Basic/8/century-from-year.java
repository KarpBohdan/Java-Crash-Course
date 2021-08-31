public class Solution {
    public static int century(int number) {
        if(number%100==0)number--;
        return number/100+1;
    }
}