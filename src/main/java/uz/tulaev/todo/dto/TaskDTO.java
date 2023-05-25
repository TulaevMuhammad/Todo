package uz.tulaev.todo.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class TaskDTO {

    private String title;
    private String description;
    private LocalDate dueDate;
    private boolean completed;
}
