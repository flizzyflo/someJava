public class EqualSidesOfArray {
    public static int findEvenIndex(int[] arr) {
        int right = arr.length;
        int sumLeft = 0; 
        int sumRight = 0;
        
        for (int left = 0; left <= right; left ++)
        {
            sumLeft += arr[left];
            for (right = arr.length - 1; right >= left; right --)
            {
                sumRight += arr[right];
            }

            if (sumLeft == sumRight)
            {
                return left;
            }
            sumRight= 0;
            right = arr.length - 1;
        }
        return -1;
      }


    public static void main(String [] args)
    {
     int[] arrr= {1,2,3,4,5,6};
     System.out.println(findEvenIndex(arrr));
    }
}
