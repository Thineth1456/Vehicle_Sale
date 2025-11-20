package edu.icet.repository.custom.Impl;

import edu.icet.repository.custom.CustomerRepository;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public boolean save(Object o) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public List getAll() {
        return List.of();
    }
}
