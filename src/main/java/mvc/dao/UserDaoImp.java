package mvc.dao;
import mvc.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDAO{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public List<User> getAllUsers() {
       // List<User> listUser = entityManager.createQuery("SELECT e FROM User e").getResultList();

        return entityManager.createQuery("from User", User.class).getResultList();
    }

}
