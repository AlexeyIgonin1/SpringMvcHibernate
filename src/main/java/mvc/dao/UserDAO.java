package mvc.dao;

import mvc.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


public interface UserDAO {

    public List<User> getAllUsers();

}
