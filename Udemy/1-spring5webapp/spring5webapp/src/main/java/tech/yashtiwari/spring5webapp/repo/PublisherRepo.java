package tech.yashtiwari.spring5webapp.repo;

import org.springframework.data.repository.CrudRepository;
import tech.yashtiwari.spring5webapp.model.Publisher;

public interface PublisherRepo extends CrudRepository<Publisher, Long> {
}
