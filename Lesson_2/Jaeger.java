public class Jaeger {
    private String modelName;
    private String mark;
    private float height;
    private int weight;
    private int speed;
    private int strength;
    private int armor;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    void fight() {
        System.out.println(modelName + " начинает сражение");
    }

    void useFirstWeapon() {
        System.out.println(modelName + " использует первое оружие");
    }

    void useSecondWeapon() {
        System.out.println(modelName + " использует второе оружие");
    }

    void walk() {
        System.out.println(modelName + " начинает движение");
    }
}