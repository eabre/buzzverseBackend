package com.backend.buzzverse.Controller;

import com.backend.buzzverse.Entity.Users;
import com.backend.buzzverse.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("")
    private Users submitUser(@RequestBody Users users){
        return userService.submitMetaDataOfUser(users);
    }

    @GetMapping("/{userId}")
    private Users getUserDetails(@PathVariable("userId") String userId) {
        return userService.displayUserMetaData(userId);
    }
}
