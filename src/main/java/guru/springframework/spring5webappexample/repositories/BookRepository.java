package guru.springframework.spring5webappexample.repositories;

import guru.springframework.spring5webappexample.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
    
}
