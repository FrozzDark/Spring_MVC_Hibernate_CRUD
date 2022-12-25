package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> users() {
        return userDAO.users();
    }

    @Override
    public User showUser(long id) {
        return userDAO.showUser(id);
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }
    @Override
    public void update(User updatedUser, long id) {
        userDAO.update(updatedUser, id);
    }

    @Override
    public void delete(long id) {
        userDAO.delete(id);
    }
}
