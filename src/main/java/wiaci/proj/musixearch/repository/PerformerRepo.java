package wiaci.proj.musixearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wiaci.proj.musixearch.entity.Performer;

@Repository
public interface PerformerRepo extends JpaRepository<Performer, Long> {
}
