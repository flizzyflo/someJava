public class KeepHydrated {
    public int Liters(double time)
    {   
        double litersPerHour = 0.5;
        return (int) Math.floor(time * litersPerHour);
    }
}
