package pulsegrid.core;

public class Active extends Us {

    private int activity;

    public Active(String name, int level, String role, int activity) {
        super(name, level, role);
        this.activity = activity;
    }

    @Override
    public void act() {
        super.act();
        System.out.println("Activity Level: " + activity);
    }
}
