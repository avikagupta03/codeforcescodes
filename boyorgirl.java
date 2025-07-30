import java.util.Scanner;

public class boyorgirl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();

        int[] arr=new int[26];

        for(char ele:inp.toCharArray()){
            arr[ele-'a']++;
        }
        int count=0;
        for(int ele:arr){
            if(ele!=0){
                count++;
            }
        }

        if(count%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println( "IGNORE HIM!");
        }
    }    
}
