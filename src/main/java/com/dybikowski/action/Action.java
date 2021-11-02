package com.dybikowski.action;

import com.dybikowski.model.Role;

import java.util.List;

public interface Action {
    String getDisplayName();

    void execute();

    List<Role> getAllowedRoles();
}
