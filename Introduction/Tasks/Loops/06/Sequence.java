public class Sequence{

    public static int[] reverse(int n){
        int[] mas=new int [n];
        int j=0;
        for(int i=n;i>0;i--)
        {
            mas[j]=i;
            j++;
        }
        return mas;
    }

}