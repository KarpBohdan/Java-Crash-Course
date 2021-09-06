public class Leetspeak {

    public String encode(String source){
        String rez="";
        for(int i=0; i< source.length();i++){
            switch (source.charAt(i)) {
                case  ('a'):
                    rez=rez+4;
                    break;
                case ('e'):
                    rez=rez+3;
                    break;
                case ('l'):
                    rez=rez+1;
                    break;
                case ('m'):
                    rez=rez+"/^^'\'";
                    break;
                case ('o'):
                    rez=rez+"0";
                    break;
                case ('u'):
                    rez=rez+"(_)";
                    break;
                default:
                    rez=rez+source.charAt(i);
                    break;
            }

        }
        return rez;
    }

}

abstract class Encoder{
    public abstract String encode(String source);
}