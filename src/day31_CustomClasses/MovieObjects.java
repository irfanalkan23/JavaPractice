package day31_CustomClasses;

public class MovieObjects {

    public static void main(String[] args) {
        Movie movie1 = new Movie("USA", "Journey to SDET: Cydeo Batch EU8", "10/25/2021", "Kuzat Altay");
        String[] casting = {"Muhtar", "Asiya", "Adam", "İrfan", "Burhan", "Ömer", "Zeynep", "Yasemin"};
        movie1.addCasts(casting);
        movie1.genre = "Adventure, Comedy, Thriller";
        System.out.println(movie1);

        Movie movie2 = new Movie("Turkey", "Turkey 2023", "01/01/2023", "X.Y.");
        movie2.addCast("A");
        movie2.addCast("B");
        System.out.println(movie2);
    }
}
/*
    3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie
 */