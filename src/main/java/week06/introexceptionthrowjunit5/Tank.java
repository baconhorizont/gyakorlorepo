package week06.introexceptionthrowjunit5;

public class Tank {

    private int angle;

    public void modifyAngle(int angleNumber){
        int actualAngle = angle + angleNumber;
        if (actualAngle > 80 || actualAngle < -80){
            if(actualAngle == 180){
            throw new IllegalArgumentException("nem tud hátra forduli a tank");
            }
            if(actualAngle > 80){
                throw new IllegalArgumentException("nem tud ennyit jobbra forduli a tank");
            }
            if(actualAngle < -80){
                throw new IllegalArgumentException("nem tud ennyit balra forduli a tank");
            }

        } else{
            angle = angle + angleNumber;
        }

    }

    public int getAngle() {
        return angle;
    }
}
