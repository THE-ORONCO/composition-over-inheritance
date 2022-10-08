package org.example.composition.delegates;

import org.example.composition.User;

public interface CanUpdateUser {
    default void update(User user){
        System.out.printf("updated user %s", user);
    }
}
