public class Kata {
    public static int makeMove(int sticks) {
        if(sticks<=3) return sticks;
        else if (sticks == 6) return 2;
        else if (sticks == 7) return 3;
        else return 1;
    }
}