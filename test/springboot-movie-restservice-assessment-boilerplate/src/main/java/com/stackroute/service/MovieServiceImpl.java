package com.stackroute.service;

import com.stackroute.dao.MovieRepository;
import com.stackroute.exceptions.MovieAlreadyExistException;
import com.stackroute.exceptions.MovieNotFoundException;
import com.stackroute.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/* Annotate the class with @Service Annotation */
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    /*
     * Constructor based Autowiring should be implemented
     */


    /*
     * This is method is used to get all the Movies
     */
    @Override
    public List<Movie> getAll() {
        List<Movie> movies = movieRepository.findAll();
        return movies;
    }



    /*
     * This method is used to get a Movie by id.
     * The method should throw MovieNotFoundException, if the movie with the given id
     * is not found
     */
    @Override
    public Movie getById(int id) throws MovieNotFoundException {
        Optional<Movie> movie = movieRepository.findById(id);
        if(movie.isPresent()){
            Movie movie1 = movie.get();
            return movie1;
        }
        else {
//            Movie dummymovie1 = new Movie(000,"dummy","dummy","dummy");
//            return dummymovie1;

            throw new MovieNotFoundException();
        }

    }


    /*
     * This method is used to save a new Movie.
     * The method should throw MovieAlreadyExistException, if the new movie that we are
     * trying save is already saved
     */
    @Override
    public Movie addNew(Movie emp) throws MovieAlreadyExistException {
        Optional<Movie> movie1 = movieRepository.findById(emp.getId());
//        List<Movie> movies = movieRepository.findByMovieName(emp.getMovieName());

        if(movie1.isPresent()){
//            Movie dummymovie1 = new Movie(000,"dummy","dummy","dummy");
//            return dummymovie1;
            throw new MovieAlreadyExistException();
        }
        else {
            Movie movie = movieRepository.save(emp);
            return movie;
        }
    }
}
