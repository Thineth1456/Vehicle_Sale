package edu.icet.repository;

import java.sql.SQLException;
import java.util.List;

public interface CrudRepository<T> extends SuperRepository {
    boolean save(T t) throws SQLException;
    boolean delete(String id) throws SQLException;
    List<T> getAll() throws SQLException;
    boolean update(T t) throws SQLException;
}
