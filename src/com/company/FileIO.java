package com.company;

import java.util.ArrayList;

public class FileIO
{
    private ArrayList<Team> tour;
    {
        tour = new ArrayList<>();
    }
    public void addTeamToTournament(Team team)
    {
        tour.add(team);
    }

    /*
    static ArrayList<String> name;

    public static void createTournament() throws IOException
    {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Velkommen til bordfodboldturneringen, tast 1 for at oprette dit hold");
        String input;
        input = scanner.nextLine();

        if (!input.equalsIgnoreCase("1"))
        {
            return;
        }
        TextUI.saveInput();
    }

}
    public static void saveInput() throws IOException
    {
        FileWriter out;
        out = new FileWriter("src/com/company/data.txt", true);
        Scanner sc;
        sc = new Scanner(System.in);
        String input;
        while (name.size() <= 4)
        {
            System.out.println("Indtast venligst navnene på spillerne:");
            name.add(sc.next());
        }
        System.out.print(name);
        out.write(name +"\n");
        out.close();
    }
    static ArrayList<String> name;

     */
}