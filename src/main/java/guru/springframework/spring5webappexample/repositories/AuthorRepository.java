package guru.springframework.spring5webappexample.repositories;

import guru.springframework.spring5webappexample.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
