package wiaci.proj.musixearch.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "performer")
@Data
public class Performer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String img;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "performer_to_genre",
            joinColumns = @JoinColumn(name = "performer_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genres;

    @OneToMany(mappedBy = "album", fetch = FetchType.LAZY)
    private List<Album> albums;

}
