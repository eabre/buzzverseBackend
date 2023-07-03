package com.backend.buzzverse.Service;

import com.backend.buzzverse.Entity.Users;
import com.backend.buzzverse.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public Users submitMetaDataOfUser(Users user) {
        return userRepo.save(user);
    }

    public Users displayUserMetaData(String userId) {
        return userRepo.findByUserId(userId);
    }
}
