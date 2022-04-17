class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "мужской";
        wolf.name = "Балто";
        wolf.weight = 40;
        wolf.age = 8;
        wolf.color = "серый";

        System.out.format("Пол - %s, имя - %s, вес - %d, возраст - %d, цвет - %s", wolf.gender, wolf.name, wolf.weight, wolf.age, wolf.color);

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}