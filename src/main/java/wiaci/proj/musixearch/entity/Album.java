package wiaci.proj.musixearch.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "album")
@Data
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @ManyToOne(fetch = FetchType.EAGER)
    private Performer performer;

    @Column(name = "cover_img")
    private String coverImg;

    private String duration;

    @Column(name = "song_list")
    private String songList;

    private String description;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "album_in_list",
            joinColumns = @JoinColumn(name = "album_id"),
            inverseJoinColumns = @JoinColumn(name = "list_id"))
    private List<ListOfAlbums> lists;
}
