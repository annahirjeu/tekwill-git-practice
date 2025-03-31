package test;

public class Manager extends Employee {
    private int teamSize;

    void reportingDailyProgress() {
        System.out.println("Team today is bravo!");
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
