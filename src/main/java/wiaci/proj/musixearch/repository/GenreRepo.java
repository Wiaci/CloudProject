package wiaci.proj.musixearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wiaci.proj.musixearch.entity.Genre;

@Repository
public interface GenreRepo extends JpaRepository<Genre, Long> {
}