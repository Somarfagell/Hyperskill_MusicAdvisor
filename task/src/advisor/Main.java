package advisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean authStatus = false;

        String option = "";
        String[] news = {
                "Mountains [Sia, Diplo, Labrinth]",
                "Runaway [Lil Peep]",
                "The Greatest Show [Panic! At The Disco]",
                "All Out Life [Slipknot]"
        };
        String[] featured = {
                "Mellow Morning",
                "Wake Up and Smell the Coffee",
                "Monday Motivation",
                "Songs to Sing in the Shower"
        };
        String[] categories = {
                "Top Lists",
                "Pop",
                "Mood",
                "Latin"
        };
        String[] playlist = {
                "Walk Like A Badass",
                "Rage Beats",
                "Arab Mood Booster",
                "Sunday Stroll"
        };



        while (!option.equals("exit"))
        {
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextLine();

            if(option.equals("auth")){
                authStatus = true;
                System.out.println("https://accounts.spotify.com/authorize?client_id=a19ee7dbfda443b2a8150c9101bfd645&redirect_uri=http://localhost:8080&response_type=code");
                System.out.println("---SUCCESS---");
            }

            if (authStatus) {
                switch (option) {
                    case "featured" -> {
                        System.out.println("---FEATURED---");
                        for (String s : featured) {
                            System.out.println(s);
                        }
                    }
                    case "new" -> {
                        System.out.println("---NEW RELEASES---");
                        for (String s : news) {
                            System.out.println(s);
                        }
                    }
                    case "categories" -> {
                        System.out.println("---CATEGORIES---");
                        for (String s : categories) {
                            System.out.println(s);
                        }
                    }
                    case "playlists Mood" -> {
                        System.out.println("---MOOD PLAYLISTS---");
                        for (String s : playlist) {
                            System.out.println(s);
                        }
                    }
                    case "exit" -> {
                        System.out.println("---GOODBYE!---");
                        break;
                    }
                    default -> {
                    }
                }
            } else {
                System.out.println("Please, provide access for application.");
            }

        }



    }
}
