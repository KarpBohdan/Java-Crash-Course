public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {
        String s="";
        s=arr[0];
        arr[0]=arr[2];
        arr[2]=s;
        return arr;
    }
}