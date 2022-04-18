public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setMark("Mark-3");
        jaeger1.setHeight(79.25f);
        jaeger1.setWeight(1980);
        jaeger1.setSpeed(7);
        jaeger1.setStrength(8);
        jaeger1.setArmor(6);

        jaeger2.setModelName("Striker Eureka");
        jaeger2.setMark("Mark-5");
        jaeger2.setHeight(76.2f);
        jaeger2.setWeight(1850);
        jaeger2.setSpeed(10);
        jaeger2.setStrength(10);
        jaeger2.setArmor(9);

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