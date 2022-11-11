package HW_lesson1;

public class Go {
    public static void main(String[] args) {


            Course c = new Course(new Triathlon[] {
                    new Jumping(4),
                    new Swimming(3),
                    new Running(7)
            });
            Team team = new Team("Dream Team",
                    (TeamMembers) new Ratel("Инноагентий", 999, 999, 0),
                    (TeamMembers) new Rhinoceros("Малыш", 3, 0, 0),
                    (TeamMembers) new Giraffe("Длинный", 9, 14, 0),
                    (TeamMembers) new Hippopotamus("Худой", 2, 0, 50));
            team.getTeamInfo();

            c.justDoIt(team);

        }
}
