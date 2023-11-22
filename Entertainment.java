
abstract class EntertainmentMedia {
    private String title;
    private int year;

    public EntertainmentMedia(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public abstract void play(); // Abstract method to be implemented by subclasses

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
    }

    public final void showType() {
        System.out.println("This is an entertainment media.");
    }
    public String getTitle(){
        return this.title;
    }
}


class Movie extends EntertainmentMedia {
    private String director;

    public Movie(String title, int year, String director) {
        super(title, year);
        this.director = director;
    }

    @Override
    public void play() {
        System.out.println("Playing the movie: " + super.getTitle());
    }

    public void movieSpecificMethod() {
        System.out.println("This method is specific to movies.");
    }
}



public class Entertainment {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", 2010, "Christopher Nolan");


        movie.displayDetails();
        movie.play();
        movie.showType();
        movie.movieSpecificMethod();

        System.out.println();

     
    }
}
