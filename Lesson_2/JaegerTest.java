public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Gipsy Danger", "Mark-3", 79.25f, 1980, 7, 8, 6);
        Jaeger jaeger2 = new Jaeger("Striker Eureka", "Mark-5", 76.2f, 1850, 10, 10, 9);

        System.out.println("Высота " + jaeger1.getModelName() + " составляет " + jaeger1.getHeight() + " метров");
        jaeger1.walk();
        jaeger1.fight();
        jaeger1.useFirstWeapon();
        jaeger1.useSecondWeapon();

        System.out.println("\nВес " + jaeger2.getModelName() + " составляет " + jaeger2.getWeight() + " тонн");
        jaeger2.walk();
        jaeger2.fight();
        jaeger2.useFirstWeapon();
        jaeger2.useSecondWeapon();
    }
}