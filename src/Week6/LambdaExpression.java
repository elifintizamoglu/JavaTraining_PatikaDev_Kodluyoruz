package Week6;

public class LambdaExpression {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Sınıfı");
            }
        };
        r1.run();

        Runnable r2 = () -> System.out.println("r2 sınıfı");
        r2.run();
    }
}
