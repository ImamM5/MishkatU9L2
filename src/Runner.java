public class Runner
{
    public static void main(String [] args)
    {
        Artist a1 = new Artist("Tommy", 20, "New York");
        a1.practice();
        a1.travels();
        System.out.println(a1.getAge());
        System.out.println(a1.getName());
        System.out.println(a1.getLocation());

        System.out.println();
        Filmmaker f1 = new Filmmaker("Den", 37, "London", 3, true);
        f1.makesMovies();
        f1.worksWithOthers();
        System.out.println(f1.isLeadership());
        System.out.println(f1.getCommunicationSkills());
        f1.practice();
        f1.travels();
        System.out.println(f1.getAge());
        System.out.println(f1.getLocation());
        System.out.println(f1.getName());


        System.out.println();
        Sculptor s1 = new Sculptor("Jack",45, "Washington", 3, false);
        s1.worksAlone();
        s1.makesSculptures();
        System.out.println(s1.getKnowsTechniques());
        System.out.println(s1.isInvestigative());
        s1.practice();
        s1.travels();
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getLocation());



    }
}
