package pulse2.core;

public class Admin extends Entity {

    private String power;

    public Admin(String name, int level, String power) {
        super(name, level);
        this.power = power;
    }

    @Override
    public void act() {
        super.act();
        System.out.println("Admin power: " + power);
    }

    public static void staticInfo() {
        System.out.println("Admin static override (method hiding)");
    }
}
