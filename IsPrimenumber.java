
public class IsPrimenumber {
     

     public static void main(String[]args){


        int[] numbers = new int[101];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i;
        };
        
        for (int number: numbers){
            System.out.print("Number " + number + ": ");
            istPrimzahl(number);
        }
     }
 

    public static void istPrimzahl (long n){

        if (CheckIsPrimenumber(n)==true){   
            System.out.println("YES");
        }
        else{
            System.out.println("NO"); 
        }
    };

    public static boolean CheckIsPrimenumber(long n) {
        if (n <= 1)  
        {
            return false;
        };

        if (n > 1)  
        {
            for (int i = 2; i <= n / 2; i++)  
            
            {   
                if (n % i == 0)  
                {
                    return false;   
                };
            }
        };

    return true;  
    }
}

       