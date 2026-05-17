import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimeManager
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Anime> Names = new ArrayList<>();
        Scanner sc = new Scanner(new File("C:\\Users\\ethan\\OneDrive\\Documents\\Text\\anime.txt"));

        for (int i = 0; i < 7; i++)
        {
            sc.nextLine();
        }

        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals("etc...")) {
                break;
            }
            Names.add(new Anime(line));
        }

        System.out.println();

        for (Anime item : Names)
        {
            System.out.println(item.getName());
        }

        System.out.println();
        System.out.println("There are currently " + Names.size() + " animes in this list.");

        System.out.println();
        System.out.println();


        for (int i = Names.size() - 1; i > 0; i--)
        {
            for (int j = i - 1; j >= 0; j--)
            {
                if (Names.get(i).getName().equals(Names.get(j).getName()))
                {
                    System.out.println("Removing dupes of " + Names.get(i) + "!");
                    Names.remove(j);
                }
            }
        }

        System.out.println();
        System.out.println();


        for (Anime item : Names)
        {
            System.out.println(item.getName());
        }
        System.out.println();
        System.out.println("There are currently " + Names.size() + " animes in this list.");
    }
}
