package HW_lesson1;


public class Team {
    private String name;
    private TeamMembers[] teamMembers;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, TeamMembers... teamMembers) {
        this.name = name;
        this.teamMembers = teamMembers;
    }

    public void getTeamInfo() {
        System.out.println("Команда: " + this.name);
        for (TeamMembers teamMembers : teamMembers) {
            if (teamMembers instanceof Rhinoceros) {
                System.out.println("Носорог " + teamMembers.getName());
            }
            if (teamMembers instanceof Ratel) {
                System.out.println("Медоед " + teamMembers.getName());
            }
            if (teamMembers instanceof Giraffe) {
                System.out.println("Жираф " + teamMembers.getName());
            }
            if (teamMembers instanceof Hippopotamus) {
                System.out.println("Бегемот " + teamMembers.getName());
            }
        }
    }

    public void showResults() {
        for (TeamMembers teamMembers : teamMembers) {

            if (!teamMembers.isOnDistance()) {
                break;
            }
        }
    }

    public void doIt(Triathlon triathlon) {
        for (TeamMembers teamMembers : teamMembers) {
            triathlon.justDoIt(teamMembers);

        }
    }
}


