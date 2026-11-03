package pkg;

public class Movie {
    String name;
    double rating;
    int numRatings;
    int revenue;
    double totalRating;
    
    public Movie() {
        name = "Avenger";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }

    public Movie(String a, double b, int c, int d) {
        name = a;
        rating = b;
        numRatings = c;
        revenue = d;
    }
    public void movieToString(){
        System.out.println("Moive:" + name);
        System.out.println("Moive:" + rating);
        System.out.println("Moive:" + numRatings);
        System.out.println("Moive:" + revenue);
        System.out.println(" ");
    }
    public String getMovieName(){
        return name;
    }
    public int getRevenue(){
        return revenue;
    }
    public double getRating(){
        return rating;
    }
    
    public double addRating(double a){
        totalRating = numRatings * rating;
        numRatings++;
        totalRating = totalRating + a;
        totalRating = totalRating/numRatings;
        rating = totalRating;
        return rating;
    }
        public boolean compareRatings(double a){
        if(rating >= a){
            return true;
        }
        else{
            return false;
        }
    }
}