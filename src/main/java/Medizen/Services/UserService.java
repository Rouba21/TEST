package Medizen.Services;


import Medizen.Interfaces.IService;
import Medizen.Models.User;
import Medizen.Utils.MaConnexion;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;


public class UserService implements IService<User>  {
    //att
    Connection cnx= MaConnexion.getInstance().getCnx();
    //actions

    @Override
    public void add(User user)  {
        String query = "INSERT INTO `user`(`email`, `password`,`roles`, `username`, `lastname`, `date_de_naissance`, `blocked`) VALUES (?, ?, ?, ?, ?,?, ?)";

        try {

            PreparedStatement statement = cnx.prepareStatement(query);
            statement.setString(1, user.getEmail());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getRoles());
            statement.setString(4, user.getUsername());
            statement.setString(5, user.getLastname());
            statement.setDate(6, user.getDate_de_naissance());
            statement.setBoolean(7, user.isBlocked());

            statement.executeUpdate();

            System.out.println("User ajouté");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void delete(User user) throws SQLException {

    }

    @Override
    public void update(User user) throws SQLException {

    }

    @Override
    public List<User> Readall() throws SQLException {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getOne(int id) {
        return null;
    }
}
