package is.hi.hbv501g.hbv501gteam4.Repositories;

import is.hi.hbv501g.hbv501gteam4.Persistence.Entities.Disc;
import is.hi.hbv501g.hbv501gteam4.Persistence.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiscRepository extends JpaRepository<Disc, Long> {
    List<Disc> findByName(String name);
    List<Disc> findAll();
    Disc findBydiscID(long id);

    List<Disc> findByUser(User user);

    List<Disc> findByPriceBetween(int fromPrice, int toPrice);
    List<Disc> findByColour(String colour);
    List<Disc> findByCondition(String condition);

    Disc save(Disc disc);
    void delete(Disc disc);

    //to find the name regardless of upper or lower case or only one or two letters from the name.
    List<Disc> findByNameContainingIgnoreCase(String partialName);
}
