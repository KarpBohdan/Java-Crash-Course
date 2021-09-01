public class Kata {
    public static String rps(String p1, String p2) {
        String answer="";
        if(p1==p2){
            answer="Draw!";
        }

        else if(p1=="rock"){
            if(p2=="scissors"){
                answer="Player 1 won!";
            }
            else if(p2=="paper"){
                answer="Player 2 won!";
            }
        }
        else if(p1=="scissors"){
            if(p2=="rock"){
                answer="Player 2 won!";
            }
            else if(p2=="paper"){
                answer="Player 1 won!";
            }
        }
        else if(p1=="paper"){
            if(p2=="rock"){
                answer="Player 1 won!";
            }
            else if(p2=="scissors"){
                answer="Player 2 won!";
            }
        }
        return answer;
    }
}
