public class BasicOperations
{
    public static Integer basicMath(String op, int v1, int v2)
    {
        Integer i=0;
        if(op=="+")
        {
            i=v1+v2;
        }
        else if(op=="-"){
            i=v1-v2;
        }
        else if(op=="*"){
            i=v1*v2;
        }
        else if(op=="/"){
            i=v1/v2 ;
        }
        return i;
    }
}