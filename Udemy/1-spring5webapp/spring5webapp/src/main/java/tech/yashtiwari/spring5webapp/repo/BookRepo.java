package tech.yashtiwari.spring5webapp.repo;

import org.springframework.data.repository.CrudRepository;
import tech.yashtiwari.spring5webapp.model.Book;

public interface BookRepo extends CrudRepository<Book, Long> {
}
