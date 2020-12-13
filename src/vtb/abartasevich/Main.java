package vtb.abartasevich;

public class Main {

    public static void main(String[] args) {
        int a=1, b=1;
        while (b<=10){
            for(a=1; a<=10; a++)
                System.out.print(a*b + " ");
            System.out.println(" ");
            b++;
        }

        System.out.println(" ");
    }
}
