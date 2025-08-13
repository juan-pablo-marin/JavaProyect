package proyectoJava.proyecto1.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ValueGenerationType;
import org.springframework.core.SpringVersion;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    private String email;
}
