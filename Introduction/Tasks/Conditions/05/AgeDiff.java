public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        String answer;
        if(yearTo>birth){
            if(yearTo-birth==1){
                answer="You are "+(yearTo-birth)+" year old.";
            }
            else{
                answer="You are "+(yearTo-birth)+" years old.";
            }
        }
        else if (yearTo==birth){
            answer="You were born this very year!";
        }
        else{
            if(birth-yearTo==1){answer="You will be born in "+(birth-yearTo)+" year.";}
            else{
                answer="You will be born in "+(birth-yearTo)+" years.";
            }
        }
        return answer;
    }
}