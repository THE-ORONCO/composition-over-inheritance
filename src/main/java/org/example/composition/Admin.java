package org.example.composition;

import org.example.composition.delegates.CanDeactivateUser;
import org.example.composition.delegates.CanDeleteUser;
import org.example.composition.delegates.CanUpdateUser;

/**
 * - can be messaged
 * - can update users
 * - can deactivate users
 * - can delete users
 */
public class Admin extends User implements CanUpdateUser, CanDeactivateUser, CanDeleteUser {
}
