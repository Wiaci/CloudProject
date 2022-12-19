package wiaci.proj.musixearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wiaci.proj.musixearch.entity.Album;
import wiaci.proj.musixearch.entity.Grade;

@Repository
public interface GradeRepo extends JpaRepository<Grade, Long> {
}

