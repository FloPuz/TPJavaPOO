package app.repositories;

import app.entities.User;

import java.sql.SQLException;
import java.util.List;

public interface IBaseRepository<T> {

    /**
     * Get all the database's users
     * @return a list of User
     */
    List<T> getAll() throws SQLException;

    /**
     * Get a user by id
     * @return the User identified by Id
     */
    T getById(Long id) throws SQLException;

    /**
     * Insert a user
     * @param user
     * @return the user inserted
     */
    T insertUser(T user) throws SQLException;

    /**
     * Update
     * @param user
     * @return the updated User before being updated
     */
    T updateUser(T user) throws SQLException;

    /**
     * Delete
     * @param user
     * @return
     */
    T deleteUser(T user) throws SQLException;
}
