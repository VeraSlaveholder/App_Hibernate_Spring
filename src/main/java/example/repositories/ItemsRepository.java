package example.repositories;

import example.models.Item;
import example.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item,Integer> {
    List<Item> findByItemName(String item);

    List<Item> findByOwner(Person owner);
}
