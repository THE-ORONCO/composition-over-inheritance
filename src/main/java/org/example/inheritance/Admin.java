package org.example.inheritance;


/**
 * - can be messaged
 * - can update users
 * - can deactivate users
 * - can delete users
 */
public class Admin extends User {

    void updateUsers(User user) {
        getLogger().info("updated user %s".formatted(user));
    }

    void deactivate(User user){
        getLogger().info("deleted user %s".formatted(user));
    }

    void deleteUsers(User user){
        getLogger().info("deleted user %s".formatted(user));
    }
}
