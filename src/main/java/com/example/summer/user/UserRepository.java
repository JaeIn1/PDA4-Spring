package com.example.summer.user;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {
    Map<Integer , User> userTable = new HashMap<>();
    int idx = 1;

    public User save(User user) {
        user.setKey(idx);
        userTable.put(idx, user);
        return userTable.get(idx++);
    }

    public boolean checkLogin(User user){
        for(User u : userTable.values()){
            if(user.getId().equals(u.getId()) && user.getPassword().equals(u.getPassword())){
                return true;
            }
        }
        return false;
    }
}
