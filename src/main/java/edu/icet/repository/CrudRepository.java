package edu.icet.repository;

import java.util.List;

public interface CrudRepository<T> {
    boolean save(T t);
    boolean delete(String id);
    List<T> getAll();
}
