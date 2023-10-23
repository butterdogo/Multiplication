import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner tgb = new Scanner(System.in);
        int tal = tgb.nextInt();
        tgb.nextLine();

        /*
        for (int i = 1; i <= 10; i++) {


            System.out.println(tal * i);
        }
    */
    /*
        int i = 1;
        while (i <11)   {
            System.out.println(i * tal);
            i++;

        }
    */
        int i = 1;
        do {
            System.out.println(i * tal);
            i++;
        }
        while (i <11);
        }


    }
