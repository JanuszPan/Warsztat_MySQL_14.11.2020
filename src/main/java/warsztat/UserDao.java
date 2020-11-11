package warsztat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
//    zapytania CRUD (create, read, update, delete) + findAll + deleteAll

    //    zapytanie tworzące użytkownika (create)
    private static final String CREATE_USER_QUERY = "INSERT INTO users(username,email,password) VALUES (?,?,?);";
    //    zapytanie wczytujące wszystkie dane użytkownika (read)
    private static final String READ_USER_QUERY = "SELECT * FROM users WHERE id=?;";
    //    zapytanie edytujące dane użytkownika (update)
    private static final String UPDATE_USER_QUERY = "UPDATE users set email=?, username=?, password=? WHERE id=?;";
    //    zapytanie usuwające użytkownika (delete)
    private static final String DELETE_USER_QUERY = "DELETE FROM users WHERE id=?;";
    //    zapytanie czytujące wszystkich użytkowników
    private static final String FIND_ALL_USERS_QUERY = "SELECT * FROM users;";

//    tworzenie użytkownika

public User create(User user){
    try (Connection conn =DbUtil.connect()){
//        trzeba jeszcze dodać identyfikator wiersza
        PreparedStatement statement=conn.prepareStatement(CREATE_USER_QUERY);
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getEmail());
//trzeba zahaszować hasło http://www.mindrot.org/projects/jBCrypt/
        statement.setString(3, user.getPassword());

    } catch (SQLException e){
        e.printStackTrace();
    }

    return user;
}


}
