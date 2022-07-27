public class ArrayMultiplier {
    public class Kata{

        public static int grow(int[] numbers){
            int result = numbers[0];
            for (int number = 1; number < numbers.length; number++)
            {
                result *= numbers[number];
            };
            return result;
        
        }
      
      }
}
