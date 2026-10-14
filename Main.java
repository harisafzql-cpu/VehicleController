public class Main {
    public static void main(String[] args) {
        SUV fortuner = new SUV("Fortuner", false);
        fortuner.move(20, 10);
        fortuner.accelerate(10);
        fortuner.changeSpeed(50, 0);
    }
}
