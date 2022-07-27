import java.lang.Math;

public class Square {    
    public static boolean isSquare(int n) {        
        if (n == 0){
          return true;
        };
      
        return Math.pow(n, 0.5) == Math.floor(Math.pow(n, 0.5));
        
      };
}
