package HW_lesson1;

public class Swimming extends Triathlon {

    private double length;

    public Swimming(double length) {
        this.length = length;
    }

    @Override
    public void justDoIt(TeamMembers teamMembers) {
        teamMembers.swim(length);
    }

}
