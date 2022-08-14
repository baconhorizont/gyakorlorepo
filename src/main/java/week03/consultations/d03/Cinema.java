package week03.consultations.d03;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Movie> movieList = new ArrayList<>();

    @Override
    public String toString() {
        return "Cinema{" +
                "movieList=" + movieList +
                '}';
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public void addMovie(Movie movie){
        movieList.add(movie);
    }


    public List<String> findMovieByTime(LocalDateTime time){
        List<String> s = new ArrayList<>();
       for (int i = 0;i<movieList.size();i++){
           for (int j = 0;j<movieList.get(i).getPlayAgenda().size();j++)
           if (movieList.get(i).getPlayAgenda().get(j).equals(time)) {
                s.add(movieList.get(i).getName());
            }
        }
       return s;
    }

}
