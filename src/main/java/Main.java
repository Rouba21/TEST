
import Medizen.Utils.MaConnexion;
import Medizen.Models.User;
import Medizen.Services.UserService;


import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //MaConnexion mac1 =MaConnexion.getInstance ();
        UserService us = new UserService();
        User user0 = new User("rouba.souidi@gmail.com", "ROLE_ADMIN","password1", "rouba", "souidi", LocalDate.of(2001, 6, 20), false);
        User user1 = new User("rami@gmail.com", "ROLE_USER","password2", "rami", "souidi",LocalDate.of(2003, 6, 20), false);
        User user2 = new User("rafed@gmail.com","ROLE_USER","password3", "rafed", "souidi", LocalDate.of(2008, 6, 20),false);
        us.add(user2);

    }
}