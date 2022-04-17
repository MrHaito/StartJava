class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("мужской");
        wolf.setName("Балто");
        wolf.setWeight(40);
        wolf.setAge(9);
        wolf.setColor("серый");

        String gender = wolf.getGender();
        String name = wolf.getName();
        int weight = wolf.getWeight();
        int age = wolf.getAge();
        String color = wolf.getColor();

        System.out.format("Пол - %s, имя - %s, вес - %d, возраст - %d, цвет - %s\n", gender, name, weight, age, color);

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}