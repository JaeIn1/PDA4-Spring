package com.example.summer.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String checkLogin(User user) {
        boolean isLogin = userRepository.checkLogin(user);
        if(isLogin) return "로그인에 성공했습니다.";
        else return "로그인에 실패했습니다.";
    }

    public String addUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser.getId();
    }
}
