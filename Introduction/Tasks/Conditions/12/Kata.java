public class Kata
{
    public static String switchItUp(int number)
    { String s="";
        switch (number) {
            case  (1):
                s="One";
                break;
            case (2):
                s="Two";
                break;
            case (3):
                s="Three";
                break;
            case  (4):
                s="Four";
                break;
            case (5):
                s="Five";
                break;
            case (6):
                s="Six";
                break;
            case (7):
                s="Seven";
                break;
            case  (8):
                s="Eight";
                break;
            case (9):
                s="Nine";
                break;
            case (0):
                s="Zero";
                break;
            default:
                s="";
                break;
        }
        return s;
    }
}