package proyectoJava.proyecto1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import proyectoJava.proyecto1.Service.UserService;
import proyectoJava.proyecto1.model.User;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
		System.out.println("paso");
	}

	@Bean
	public CommandLineRunner init(UserService userService) {
		return args -> {
			User user = User.builder()
					.email("juan@example.com")
					.first_name("Juan")
					.last_name("Pérez")
					.build();
			User created = userService.createUser(user);
			System.out.println("Usuario creado: " + created);
		};
	}
}


