package _05_netflix;

public class netflix_runner {
public static void main(String[] args) {
	Movie one = new Movie("Star Wars", 4);
	Movie two = new Movie("The Twilight Zone", 1);
	Movie three = new Movie("Avengers", -20);
	Movie four = new Movie("Godzilla", 0);
	Movie five = new Movie("Titanic", 10);
	System.out.println(two.getTicketPrice());
	NetflixQueue queue = new NetflixQueue();
	queue.addMovie(one);
	queue.addMovie(two);
	queue.addMovie(three);
	queue.addMovie(four);
	queue.addMovie(five);
	queue.printMovies();
	System.out.println("The best movie is " + queue.getBestMovie());
	System.out.println("The second best movie is " + queue.getSecondBestMovie());
		
}
}
