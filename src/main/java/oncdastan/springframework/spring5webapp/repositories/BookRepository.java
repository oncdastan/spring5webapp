package oncdastan.springframework.spring5webapp.repositories;

import oncdastan.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
