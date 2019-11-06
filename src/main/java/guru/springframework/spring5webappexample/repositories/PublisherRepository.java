package guru.springframework.spring5webappexample.repositories;

import guru.springframework.spring5webappexample.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {

}
