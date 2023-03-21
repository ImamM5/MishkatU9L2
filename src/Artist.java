public class Artist
{
    private String name;
    private int age;
    private String location;

    public Artist(String name, int age, String location)
    {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public void practice()
    {
        System.out.println("I did my practice!");
    }

    public void travels()
    {
        System.out.println("I travel all the time!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }
}
