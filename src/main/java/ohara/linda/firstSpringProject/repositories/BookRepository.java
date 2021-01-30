package ohara.linda.firstSpringProject.repositories;

import ohara.linda.firstSpringProject.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{
}
