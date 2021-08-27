package com.stackroute.controller;

import com.stackroute.exceptions.MovieAlreadyExistException;
import com.stackroute.exceptions.MovieNotFoundException;
import com.stackroute.model.Movie;
import com.stackroute.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/* Annotate the class with @RestController and @RequestMapping */
@RestController
@RequestMapping(value = "/api/v1")
public class MovieController {

    @Autowired
    MovieService movieService;


    /*
     * Constructor based Autowiring should be implemented
     */


    /*
     * Define a handler method to get all the Movies. This handler method should map to
     * the URL "/movies". This method will return the List of movies in the response body
     *  with the Httpstatus OK.
     */
    @GetMapping(value = "/movies")
    public ResponseEntity<List<Movie>> getAllHandler() {
        List<Movie> result = movieService.getAll();
        return new ResponseEntity(result, HttpStatus.OK);

    }


    /*
     * Define a handler method to add a new Movie. This handler method should map to
     * the URL "/movies". This method will return the saved movie in the response body
     *  with the Httpstatus CREATED, if the movie is saved successfully, else, returns the message
     * "Movie already Exist" with the status CONFLICT.
     */
    @PostMapping(value = "/movies")
    public ResponseEntity<?> addNewHandler(@RequestBody Movie newMovie) {
        try {
            Movie result = movieService.addNew(newMovie);
            return ResponseEntity.status(HttpStatus.CREATED).body(result);
        }
        catch(MovieAlreadyExistException e){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Movie already Exist");

        }

    }



    /*
     * Define a handler method to add get a Movie by id. This handler method should map to
     * the URL "/movies/{id}". This method will return the retreived movie in the response body
     *  with the Httpstatus OK, if the movie is found, else, returns the message
     * "Movie Not found" with the status NOT_FOUND.
     */
    @GetMapping(value = "/movies/{id}")
    public ResponseEntity<?> getByIdHandler(@PathVariable int id){
        try {
            Movie result = movieService.getById(id);
            return ResponseEntity.ok(result);
        }
        catch (MovieNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Movie Not found");
        }

    }
}
