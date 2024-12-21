package gb.example.user_api.repository;

import gb.example.user_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Здесь можно добавить дополнительные методы,
}