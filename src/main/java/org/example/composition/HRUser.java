package org.example.composition;

import org.example.composition.delegates.CanDeactivateUser;
import org.example.composition.delegates.CanUpdateUser;

/**
 * - can be messaged
 * - can update users
 * - can deactivate users
 */
public class HRUser extends User implements CanUpdateUser, CanDeactivateUser {
}
