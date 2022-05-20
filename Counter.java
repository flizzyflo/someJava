public class Counter {

    public static int countSheeps(Boolean[] arrayOfSheeps) {
      int sheepCounter = 0;
      
      for (int i = 0; i < arrayOfSheeps.length; i++)
      { 
        if (arrayOfSheeps[i] == null)
        {
          continue;
        };

        if (arrayOfSheeps[i] == true)
        {
          sheepCounter++;
        };
      }
      return sheepCounter;
    }
  }