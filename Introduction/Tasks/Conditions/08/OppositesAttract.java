public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {
        boolean answer=false;
        if(flower1%2==0)
        {
            if(flower2%2==0) answer=false;
            else  answer=true;
        }
        else
        {
            if(flower2%2==0) answer=true;
            else  answer=false;
        }
        return answer;
    }

}