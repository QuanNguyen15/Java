package betamovie.betamovie.repository;

import betamovie.betamovie.entity.UserTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserTest, String> {
    boolean existsByUsername(String username);
    Optional<UserTest> findByUsername(String username);
}
