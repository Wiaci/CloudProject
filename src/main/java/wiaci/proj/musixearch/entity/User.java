package wiaci.proj.musixearch.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usr")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String password;

    private String img;

}
