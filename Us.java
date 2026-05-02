package pulse2.core;

public class Us extends Entity {

    protected String role;

    public Us(String name, int level, String role) {
        super(name, level);
        this.role = role;
    }

    @Override
    public void act() {
        super.act();
        System.out.println(name + " operates as " + role);
    }

    public static void staticInfo() {
        System.out.println("User static layer");
    }
} 