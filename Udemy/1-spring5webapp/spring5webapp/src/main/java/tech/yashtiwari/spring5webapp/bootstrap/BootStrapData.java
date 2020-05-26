package tech.yashtiwari.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tech.yashtiwari.spring5webapp.model.Author;
import tech.yashtiwari.spring5webapp.model.Book;
import tech.yashtiwari.spring5webapp.model.Publisher;
import tech.yashtiwari.spring5webapp.repo.AuthorRepo;
import tech.yashtiwari.spring5webapp.repo.BookRepo;
import tech.yashtiwari.spring5webapp.repo.PublisherRepo;

@Component //TODO
public class BootStrapData implements CommandLineRunner  /*TODO*/ {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;
    private final PublisherRepo publisherRepo;

    public BootStrapData(AuthorRepo authorRepo, BookRepo bookRepo, PublisherRepo publisherRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher1 =  new Publisher("YRT", "India");
        Publisher publisher2 =  new Publisher("YRT", "India");
        publisherRepo.save(publisher1);
        publisherRepo.save(publisher2);



        Author author = new Author("Yash", "Tiwari");
        Book book = new Book("Shit Hole", "123");
        author.getBooks().add(book);
        book.getAuthors().add(author);
        book.setPublisher(publisher1);
        publisher1.getBooks().add(book);

        authorRepo.save(author);
        bookRepo.save(book);
        publisherRepo.save(publisher1);

        Author author2 = new Author("Anika", "Tiwari");
        Book book2 = new Book("Another Shit Hole", "123");
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);
        book2.setPublisher(publisher2);
        publisher2.getBooks().add(book2);

        authorRepo.save(author2);
        bookRepo.save(book2);
        publisherRepo.save(publisher2);

        System.out.println("Bootstrap started...");
        System.out.println("Number : "+bookRepo.count());
        System.out.println("Publisher  Number : "+publisherRepo.count());
    }

}
