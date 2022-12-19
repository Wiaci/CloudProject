package wiaci.proj.musixearch.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "grade")
@Data
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    private Album album;

    private Integer rating;

}
