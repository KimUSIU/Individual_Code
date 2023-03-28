import java.util.Random;

public class Individual_Code {
    public static void main(String[] args){
        //if else
        Random random = new Random();
        int temperature = random.nextInt(80);

        System.out.println("Today's temperature is " + temperature + "°.");

        if (temperature < 15){
            System.out.println("Since it is " + temperature + "°, wear thick clothes.");
        }
        else if ((temperature > 15) && (temperature < 45)){
            System.out.println("Since it is " + temperature + "°, wear comfortable clothes.");
        }
        else{
            System.out.println("Since it is " + temperature + "°, you might burn soon! Run away!");
        }

    }


}