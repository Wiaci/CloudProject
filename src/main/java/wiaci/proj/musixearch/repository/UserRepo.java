package wiaci.proj.musixearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wiaci.proj.musixearch.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
