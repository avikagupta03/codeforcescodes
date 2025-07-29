import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class easyproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int people=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<people;i++){
            int input=sc.nextInt();
            list.add(input);
        }

        String word="EASY";
        for(int ele:list){
            if(ele==1){
                word="HARD";
                break;
            }
        }

        System.out.println(word);
        
    }    
}
