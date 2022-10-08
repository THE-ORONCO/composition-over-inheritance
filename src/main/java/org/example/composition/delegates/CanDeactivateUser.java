package org.example.composition.delegates;

import org.example.composition.User;

public interface CanDeactivateUser {
    default void deactivate(User user){
        System.out.printf("deactivate user %s", user);
    }
}
