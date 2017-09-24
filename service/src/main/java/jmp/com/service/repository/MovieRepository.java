package jmp.com.service.repository;

import jmp.com.service.domain.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieRepository {

    List<Movie> findAll();

    Optional<Movie> findOne(String id);

    Optional<Movie> findByTitle(String title);

    List<Movie> findByGenre(String genre);

    void deleteAll();

    void save(Movie movie);
}

