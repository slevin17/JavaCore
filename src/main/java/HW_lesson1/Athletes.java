package HW_lesson1;

public abstract class Athletes implements TeamMembers {

    private String name;
    private boolean onDistance;
    private double maxRun;
    private double maxJump;
    private double maxSwim;

    public Athletes(String name, double maxRun,
                  double maxJump, double maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
        this.onDistance = true;
    }



    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public String getName() {
        return this.name;
    }
    public abstract void voice();

    @Override
    public void run(double distance) {
        if (distance <= maxRun) {
            System.out.println(name + " добежал до финиша");
        } else {
            System.out.println(name + "  не добежал до финиша");
            onDistance = false;
        }
    }

    @Override
    public void jump(double height) {
        if (height <= maxJump) {
            System.out.println(name + " перепрыгнул ");
        } else {
            System.out.println(name + " не смог перепрыгнуть ");
            onDistance = false;
        }
    }

    @Override
    public void swim(double distance) {
        if (maxSwim == 0) {
            System.out.println(name + " не умеет плавать");
            onDistance = false;
        } else if (distance <= maxSwim) {
            System.out.println(name + " успешно проплыл");
        } else {
            System.out.println(name + " не смог проплыть");
            onDistance = false;
        }
    }

    @Override
    public String toString() {
        return name + " : " + (isOnDistance() ? "на дистанции" : "сошел с дистанции");
    }
}
