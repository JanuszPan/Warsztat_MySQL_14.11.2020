package warsztat;

//klasa służąca do przetestowania poprawności wywołania metod klasy UserDao
public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user =new User();
//        sprawdzenie metody public User create(User user) z klasy UserDao
//        user.setUsername("Marek");
//        user.setEmail("marek@wp.pl");
//        user.setPassword("qazwsx123");
//        userDao.create(user);

//     sprawdzenie metody public User read (int userId), ale nie wyświetla tablicy w postaci tekstowej !?
//        User read =userDao.read(1);
//        System.out.println(read);
//        User readNotExist =userDao.read(4);
//        System.out.println(readNotExist);

//        sprawdzenie metody public void update(User user)
//        User userToUpdate =userDao.read(1);
//        userToUpdate.setUsername("Ewa");
//        userToUpdate.setEmail("ewa@gmail.com");
//        userToUpdate.setPassword("123");
//        userDao.update(userToUpdate);

//        sprawdzenie metody public User[] findAll()
        User[] all=userDao.findAll();
        for (User u: all) {
            System.out.println(u);
        }

//        sprawdzenie metody public void delete(int userId)
//        userDao.delete(2);
    }

}
