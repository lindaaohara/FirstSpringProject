package ohara.linda.firstSpringProject.repositories;

import ohara.linda.firstSpringProject.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
