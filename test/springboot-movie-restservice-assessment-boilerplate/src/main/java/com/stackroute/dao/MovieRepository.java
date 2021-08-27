package com.stackroute.dao;

import com.stackroute.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/*
 * Annotate the interface with @Repository and @Transactional
 * extend the interface with JPARepository
 * */
@Repository
@Transactional
public interface MovieRepository extends JpaRepository<Movie, Integer>{

    public List<Movie> findByMovieName(String movieName);
}
