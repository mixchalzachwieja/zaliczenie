package micha.zachwieja.respository;

import micha.zachwieja.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Michał Zachwieja
 */
@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
