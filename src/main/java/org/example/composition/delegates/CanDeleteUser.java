package org.example.composition.delegates;

import org.example.composition.User;

public interface CanDeleteUser {

    default void delete(User user){
        System.out.printf("deleted user %s%n", user);
    }
}
