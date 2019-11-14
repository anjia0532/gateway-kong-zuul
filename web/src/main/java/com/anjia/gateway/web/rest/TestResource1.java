package com.anjia.gateway.web.rest;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserResource {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/{loginId}")
    public User getUserInfo(@PathVariable String loginId){
        User user = userRepository. findByLoginId(loginId)
        return user;
    }
    @PutMapping("/{loginId}")
    public User updateUserInfo(@RequestBody User user){
        User user = userRepository.save(user)
        return user;
    }
    @PostMapping("/{loginId}")
    public User createUserInfo(@RequestBody User user) {
        User user = userRepository.save(user)
        return user;
    }

    @DeleteMapping("/{loginId}/cancel")
    public User deleteUserInfo(@PathVariable String loginId,@RequestParam) {
        User user = userRepository.delete(loginId)
        return user;
    }
}
