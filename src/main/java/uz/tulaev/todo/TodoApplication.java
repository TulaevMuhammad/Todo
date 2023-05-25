package uz.tulaev.todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import uz.tulaev.todo.domain.Task;
import uz.tulaev.todo.domain.User;
import uz.tulaev.todo.repository.TaskRepository;
import uz.tulaev.todo.repository.UserRepository;

import java.time.LocalDate;

@SpringBootApplication
public class TodoApplication {

    private final UserRepository userRepository;
    private final TaskRepository taskRepository;

    public TodoApplication(UserRepository userRepository, TaskRepository taskRepository) {
        this.userRepository = userRepository;
        this.taskRepository = taskRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            User user = new User();
            user.setUsername("JohnDoe");
            user.setPassword("password123");
            userRepository.save(user);

            Task task1 = new Task();
            task1.setTitle("Task 1");
            task1.setDescription("Description for Task 1");
            task1.setDueDate(LocalDate.now().plusDays(3));
            task1.setCompleted(false);
            task1.setUser(user);
            taskRepository.save(task1);

            Task task2 = new Task();
            task2.setTitle("Task 2");
            task2.setDescription("Description for Task 2");
            task2.setDueDate(LocalDate.now().plusDays(5));
            task2.setCompleted(false);
            task2.setUser(user);
            taskRepository.save(task2);
        };
    }

}
