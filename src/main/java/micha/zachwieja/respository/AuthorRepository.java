package micha.zachwieja.respository;

import micha.zachwieja.model.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Michał Zachwieja
 */
@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {

}
