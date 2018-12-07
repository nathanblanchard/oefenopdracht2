package nl.capgemini.academy.movies.repositories;

import nl.capgemini.academy.movies.models.Airplane;
import nl.capgemini.academy.movies.models.Airplane;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "airplane")
public interface AirplaneRepository extends MongoRepository<Airplane, String> {
    Iterable<Airplane> findAllByTitle(String title);
    Iterable<Airplane> findAllByWatched(boolean watched);
}
