import java.util.Scanner;

public class wc {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char firstCharacter=str.charAt(0);
        if(firstCharacter>='a' && firstCharacter<='z'){
            firstCharacter=(char)(firstCharacter-32);
        }
        System.out.println(firstCharacter+str.substring(1));
    }
}