public class Main {
    public static void main(String[] args) throws InterruptedException {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread t=new Thread(numberGenerator);

        t.run();


    }
}