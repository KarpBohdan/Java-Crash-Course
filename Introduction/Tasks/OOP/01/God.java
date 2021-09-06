public class God {
    public static Human[] create(){
        Human[] humans =new Human[2];
        humans[0]=new Man();
        humans[1]=new Woman();
        return humans;
    }
}

abstract class Human {

}
class Man extends Human{

}
class Woman extends Human{

}