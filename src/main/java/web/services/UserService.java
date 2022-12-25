package web.services;

import web.models.User;

import java.util.List;

public interface UserService {
    public List<User> users();
    public User showUser(long id);
    public void save(User user);
    public void update(User updatedUser, long id);
    public void delete(long id);
}
