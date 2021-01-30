package ohara.linda.firstSpringProject.repositories;

import ohara.linda.firstSpringProject.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
