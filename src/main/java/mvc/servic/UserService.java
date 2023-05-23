package mvc.servic;

import mvc.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public List<User> getAllUsers();
}
