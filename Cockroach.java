

public class Cockroach {
    public int cockroachSpeed(double x){

        double cmPerSec = (x / 360) * 10000;
        return (int) Math.floor(cmPerSec);
    }
}
