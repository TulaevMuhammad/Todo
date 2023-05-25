package uz.tulaev.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.tulaev.todo.domain.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
