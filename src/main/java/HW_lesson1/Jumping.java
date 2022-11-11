package HW_lesson1;

public class Jumping extends Triathlon {

    private double height;

    public Jumping(double height) {
        this.height = height;
    }

    @Override
    public void justDoIt(TeamMembers teamMembers) {
        teamMembers.jump(height);
    }

}
