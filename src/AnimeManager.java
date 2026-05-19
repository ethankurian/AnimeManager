import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimeManager
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Anime> names = new ArrayList<>();
        Scanner sc = new Scanner(new File("C:\\Users\\ethan\\OneDrive\\Documents\\Text\\anime.txt"));

        for (int i = 0; i < 7; i++)
        {
            sc.nextLine();
        }

        while(sc.hasNextLine()) {
            String line = sc.nextLine().toLowerCase().trim();
            if (line.equals("etc...")) {
                break;
            }
            names.add(new Anime(line));
        }

        System.out.println();

        for (Anime item : names)
        {
            System.out.println(item);
        }

        System.out.println();
        System.out.println("There are currently " + names.size() + " anime in this list.");

        System.out.println();
        System.out.println();


        for (int i = names.size() - 1; i > 0; i--)
        {
            for (int j = i - 1; j >= 0; j--)
            {
                if (names.get(i).getName().equals(names.get(j).getName()))
                {
                    System.out.println("Removing dupes of " + names.get(i) + "!");
                    names.remove(j);
                    i--;
                }
            }
        }

        System.out.println();
        System.out.println();


        for (Anime item : names)
        {
            System.out.println(item);
        }
        System.out.println();
        System.out.println("There are currently " + names.size() + " anime in this list.");

        sc.close();
    }
}
