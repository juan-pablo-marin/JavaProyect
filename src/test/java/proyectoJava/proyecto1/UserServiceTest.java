package proyectoJava.proyecto1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import proyectoJava.proyecto1.Service.UserService;
import proyectoJava.proyecto1.model.User;
import proyectoJava.proyecto1.repository.UserRepository;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    private User user;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        user=new User();
        user.setEmail("elha@gmail.com");
        user.setLastName("Marin");
        user.setFirstName("Elha");
        user.setId(new Long("1"));
    }

    @Test
    void getAllUsers() {
        when(userRepository.findAll()).thenReturn(Arrays.asList(user));
        assertNotNull(userService.getAllUsers());
    }
}