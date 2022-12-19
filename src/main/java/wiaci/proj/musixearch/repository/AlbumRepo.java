package wiaci.proj.musixearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wiaci.proj.musixearch.entity.Album;

@Repository
public interface AlbumRepo extends JpaRepository<Album, Long> {
}
