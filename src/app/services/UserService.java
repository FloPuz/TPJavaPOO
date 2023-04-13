package app.services;

import app.entities.User;
import app.repositories.UsersRepository;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.List;

public class UserService extends UsersRepository{

    private UsersRepository usersRepository;

    public UserService() throws SQLException, IOException, ClassNotFoundException {
        this.usersRepository = new UsersRepository();
    }

    public void exportUsers() throws IOException, SQLException {
        try
        {
        List<User> users = usersRepository.getAll();
        FileOutputStream fileOutputStream
                = new FileOutputStream("./target/export_user.json");
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        users.stream().forEach(x-> {
            try {
                objectOutputStream.writeObject(x.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        objectOutputStream.flush();
        objectOutputStream.close();
        }catch (Exception e){
            throw e;
        }
    }

}
