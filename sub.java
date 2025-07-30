import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int k=sc.nextInt();

        while(k-->0){
            if(val%10==0){
                val/=10;
            }else{
                val--;
            }
        }
        System.out.println(val);
    }    
}
