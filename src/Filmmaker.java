public class Filmmaker extends Artist
{
    private int communicationSkills;
    private boolean leadership;

    public Filmmaker(String name, int age,String location, int communicationSkills, boolean leadership)
    {
        super(name, age, location);
        this.communicationSkills= communicationSkills;
        this.leadership = leadership;
    }

    public void makesMovies()
    {
        System.out.println("I made movies!");
    }

    public void worksWithOthers()
    {
        System.out.println("I work with others!");
    }

    public boolean isLeadership() {
        return leadership;
    }

    public int getCommunicationSkills() {
        return communicationSkills;
    }
}
