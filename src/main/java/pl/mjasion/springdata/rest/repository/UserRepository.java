package pl.mjasion.springdata.rest.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import pl.mjasion.springdata.model.User;

/**
 * @author Marcin Jasion <marcin.jasion@gmail.com>
 */
@RestResource(path = "user", rel = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
