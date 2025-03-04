package springboot.mvc.sevice;

import springboot.mvc.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    User getUser(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
