package tdd;

import org.junit.jupiter.api.Test;
import seminars.third.tdd.User;
import seminars.third.tdd.UserRepository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    @Test
    public void testAuthenticateAndFindByName() {
        // Создаем пользователей
        User admin = new User("admin", "admin123", true);
        User user1 = new User("user1", "password1", false);
        User user2 = new User("user2", "password2", false);

        // Создаем репозиторий и добавляем пользователей
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(admin);
        userRepository.addUser(user1);
        userRepository.addUser(user2);

        // Авторизуем пользователей
        admin.authenticate("admin", "admin123");
        user1.authenticate("user1", "password1");
        user2.authenticate("user2", "password2");

        // Проверяем, что пользователи успешно авторизовались
        assertTrue(admin.isAuthenticate);
        assertTrue(user1.isAuthenticate);
        assertTrue(user2.isAuthenticate);

        // Проверяем, что метод findByName работает корректно
        assertTrue(userRepository.findByName("admin"));
        assertTrue(userRepository.findByName("user1"));
        assertTrue(userRepository.findByName("user2"));
        assertFalse(userRepository.findByName("nonexistentUser"));

        // Разлогиниваем всех неадминистраторов
        userRepository.logoutAllNonAdmins();

        // Проверяем, что все неадминистраторы разлогинены
        assertTrue(admin.isAuthenticate);
        assertFalse(user1.isAuthenticate);
        assertFalse(user2.isAuthenticate);
    }
}
