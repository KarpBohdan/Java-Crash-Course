public class TrafficLights {

    public static String updateLight(String current) {
        if(current=="red"){
            return "green";
        }
        else if(current=="green"){
            return "yellow";
        }
        else {
            return "red";
        }
    }
}