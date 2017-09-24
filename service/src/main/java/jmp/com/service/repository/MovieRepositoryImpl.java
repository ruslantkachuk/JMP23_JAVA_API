package jmp.com.service.repository;

import jmp.com.service.domain.Movie;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class MovieRepositoryImpl implements MovieRepository {

    List<Movie> movies = fillMovies();

    private List<Movie> fillMovies() {
        return new ArrayList<>();
    }

    @Override
    public List<Movie> findAll() {
        return movies;
    }

    @Override
    public Optional<Movie> findOne(String id) {
        return Optional.of(movies.get(0));
    }

    @Override
    public Optional<Movie> findByTitle(String title) {
        return Optional.of(movies.get(0));
    }

    @Override
    public List<Movie> findByGenre(String genre) {
        return movies;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void save(Movie movie) {
        movies.add(movie);
    }
}
