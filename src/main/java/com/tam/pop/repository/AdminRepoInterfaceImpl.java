package com.tam.pop.repository;

import com.tam.pop.model.Admin;

import java.util.Optional;

public class AdminRepoInterfaceImpl implements AdminRepositoryInterface{
    @Override
    public Optional<Admin> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Admin findByUserName(String username) {
        return null;
    }

    @Override
    public Admin save(Admin admin) {
        return null;
    }
}
