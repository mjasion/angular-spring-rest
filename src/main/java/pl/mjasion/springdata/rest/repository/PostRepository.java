package pl.mjasion.springdata.rest.repository;

import org.springframework.data.repository.CrudRepository;
import pl.mjasion.springdata.model.Post;

/**
 * @author Marcin Jasion <marcin.jasion@gmail.com>
 */
public interface PostRepository extends CrudRepository<Post, Long> {
}
