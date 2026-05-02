package pulse2.core;

public class Entity {
    protected String name;
    protected int level;

    public Entity(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void act() {
        System.out.println(name + " exists in the system.");
    }

    public final void identity() {
        System.out.println("Core Entity detected.");
    }
}
