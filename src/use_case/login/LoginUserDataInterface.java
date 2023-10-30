package use_case.login;

import data_access.FileUserDataAccessObject;
import entity.User;

public interface LoginUserDataInterface {
    boolean existsByName(String identifier);

    void save(User user);

    User get(String username);
}
