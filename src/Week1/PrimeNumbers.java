package Week1;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime=true;
            if (i % 2 == 0) continue;
            else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
