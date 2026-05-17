public class Anime
{
    private final String name;

    public Anime(String n)
    {
        name = n;
    }

    public String getName()
    {
        String chunk;
        String last = name.substring(name.length() - 2);
        if (last.equals(" +") || last.equals(" -") || last.equals(" ~") || last.equals(" *"))
        {
            chunk = name.substring(0, name.length() - 2);
            return chunk;
        }
        return name;
    }

    public String toString()
        {
            return name;
        }
}
