package app.repositories;

import app.bdd.DbConnection;
import app.entities.User;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class UsersRepository implements IBaseRepository<User> {

    private DbConnection connection;

    public UsersRepository() throws SQLException, IOException, ClassNotFoundException {
        connection = DbConnection.getInstance();
    }
    @Override
    public List<User> getAll() throws SQLException {
        List<User> users = new ArrayList<>();

        String query = "SELECT * FROM users";
        PreparedStatement stmt = connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Long id = rs.getLong("id");
            String name = rs.getString("Name");
            String firstname = rs.getString("Firstname");
            LocalDate birthdate = LocalDate.parse(rs.getString("Birthdate"));
            users.add(new User(id, name,firstname ,birthdate));
        }

        return users;
    }

    @Override
    public User getById(Long id) throws SQLException {
        String query = "SELECT * FROM users WHERE id = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setLong(1, id);
        ResultSet rs = stmt.executeQuery();
        User user = null;
        if (rs.next()) {
            Long idUser = rs.getLong("id");
            String name = rs.getString("Name");
            String firstname = rs.getString("Firstname");
            LocalDate birthdate = LocalDate.parse(rs.getString("Birthdate"));
            user = new User(idUser, name,firstname ,birthdate);

        }
        return user;
    }

    @Override
    public User insertUser(User user) throws SQLException {
        String query = "INSERT INTO users(Name, Firstname, Birthdate) VALUES(?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, user.getName());
        stmt.setString(2, user.getFirstname());
        stmt.setDate(3, new Date(user.getBirthdate().toEpochDay()));

        stmt.executeUpdate();
        return user;
    }

    @Override
    public User updateUser(User user) throws SQLException {
        String query = "UPDATE users SET Name=?, Firstname=?, Birthdate=? WHERE id=?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, user.getName());
        stmt.setString(2, user.getFirstname());
        stmt.setDate(3, java.sql.Date.valueOf(user.getBirthdate()));
        stmt.setLong(4, user.getId());
        stmt.executeUpdate();
        return user;

    }

    @Override
    public User deleteUser(User user) throws SQLException {
        String query = "DELETE FROM users WHERE id=?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setLong(1, user.getId());
        stmt.executeUpdate();
        return user;
    }
}
