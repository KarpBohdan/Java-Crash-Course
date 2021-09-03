public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int sum=0;
        for(int i=0;i<arrayOfSheeps.length;i++){
            {
                if(arrayOfSheeps[i]==true) sum++;
            }
        }
        return sum;
    }
}