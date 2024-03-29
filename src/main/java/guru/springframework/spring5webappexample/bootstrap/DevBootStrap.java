package guru.springframework.spring5webappexample.bootstrap;

import guru.springframework.spring5webappexample.model.Author;
import guru.springframework.spring5webappexample.model.Book;
import guru.springframework.spring5webappexample.model.Publisher;
import guru.springframework.spring5webappexample.repositories.AuthorRepository;
import guru.springframework.spring5webappexample.repositories.BookRepository;
import guru.springframework.spring5webappexample.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Publisher publisher=new Publisher();
        publisher.setName("foo");
        publisherRepository.save(publisher);

        //Eric
        Author eric=new Author("Eric","Evans");
        Book ddd=new Book("Domain Driven Design","1234",publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        //Rod
        Author rod=new Author("Rad","Johnson");
        Book noEJB=new Book("J2EE Development without EJB","23444",publisher);
        rod.getBooks().add(noEJB);
        authorRepository.save(rod);
        bookRepository.save(noEJB);



    }
}
