public class Bob {
    public static int enough(int busCapacity, int passengersOnboard, int passengersWaiting){
        
        if (busCapacity < passengersOnboard + passengersWaiting)
        {
            return Math.abs(busCapacity - passengersOnboard - passengersWaiting);
        };

        return 0;
        }
}
