import java.util.Scanner;

public class toast{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   
        int k = sc.nextInt();   
        int l = sc.nextInt();  
        int c = sc.nextInt();  
        int d = sc.nextInt();   
        int p = sc.nextInt();  
        int nl = sc.nextInt();  
        int np = sc.nextInt(); 

        int totalDrink = k * l;          
        int totalSlices = c * d;         
        int totalSalt = p;               

        int drinkToasts = totalDrink / (n * nl);
        int limeToasts = totalSlices / n;
        int saltToasts = totalSalt / (n * np);

        int result = Math.min(drinkToasts, Math.min(limeToasts, saltToasts));

        System.out.println(result);
    }
}
