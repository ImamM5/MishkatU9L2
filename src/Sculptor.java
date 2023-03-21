public class Sculptor extends Artist
{
    private boolean investigative;
    private int knowsTechniques;

    public Sculptor(String name, int age,String location, int knowsTechniques, boolean investigative)
    {
        super(name, age, location);
        this.investigative = investigative;
        this.knowsTechniques = knowsTechniques;
    }

    public void makesSculptures()
    {
        System.out.println("I made sculptures!");
    }

    public void worksAlone()
    {
        System.out.println("I work aone!");
    }

    public boolean isInvestigative() {
        return investigative;
    }

    public int getKnowsTechniques() {
        return knowsTechniques;
    }
}
