package es.codeurjc.domain;
import es.codeurjc.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    private static Map<String, User> userMap;

    public UserRepository() {
        userMap = new HashMap<>();
    }

    public void addUser(User user) {
        userMap.put(user.getUsername(), user);
    }

    public static User getUserByUsername(String username) {
        return userMap.get(username);
    }
}


