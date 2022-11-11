package HW_lesson1;

public class Course {
    private Triathlon triathlons[];

    public Course(Triathlon ... triathlons) {
        this.triathlons = triathlons;
    }
    public void justDoIt(Team team){
        for (Triathlon triathlon : triathlons) {
            team.doIt(triathlon);
        }
    }
}
