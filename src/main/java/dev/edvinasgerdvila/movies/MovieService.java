package dev.edvinasgerdvila.movies;

import dev.edvinasgerdvila.movies.Movie;
import dev.edvinasgerdvila.movies.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
//    public Optional<Movie> singleMovie(ObjectId id){
//        return movieRepository.findById(id);
//
//    }
    public Optional<Movie> singleMovieImdbId(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
