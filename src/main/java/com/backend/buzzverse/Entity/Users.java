package com.backend.buzzverse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity(name="Users")
@NoArgsConstructor
@Data
public class Users {

    @Id
    @GeneratedValue
    private int id;

    @NonNull
    private String userId;
    private String userName;
    private String name;
    private String profileImage;
    public Users(int id, String userId, String userName, String name, String profileImage) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.name = name;
        this.profileImage = profileImage;
    }
}
