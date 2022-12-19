package wiaci.proj.musixearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wiaci.proj.musixearch.entity.ListOfAlbums;

@Repository
public interface ListRepo extends JpaRepository<ListOfAlbums, Long> {
}
