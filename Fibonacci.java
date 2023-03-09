package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        long a1 = 1, a2 = 1;
        int numero = 0;

        for (int i = 1; i <= 46; i++) {

            numero++;
            System.out.println("(" + numero + ")" + a1);
            numero++;
            System.out.println("(" + numero + ")" + a2);

            a1 = a1 + a2;
            a2 = a1 + a2;

        }

    }

}
