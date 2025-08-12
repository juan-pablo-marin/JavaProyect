package proyectoJava.proyecto1.Service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import proyectoJava.proyecto1.model.User;
import proyectoJava.proyecto1.repository.UserRepository;

import java.util.List;
import java.util.Optional;


@Component
@RequiredArgsConstructor
@Slf4j
@Service
public class UserService {
    @Autowired
    private  UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User getUserById (Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.get();
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void deleteUser (Long id){
        userRepository.deleteById(id);
    }

}
