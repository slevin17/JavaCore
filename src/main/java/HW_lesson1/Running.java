package HW_lesson1;

public class Running extends Triathlon {

    private double length;

    public Running(double length) {
        this.length = length;
    }

    @Override
    public void justDoIt(TeamMembers animal) {
        animal.run(length);
    }


}