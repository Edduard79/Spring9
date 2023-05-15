package exercise.exercise9;

import jakarta.persistence.*;

@Entity
@Table (name = "enrollments")
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Students student;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Classes Class;

}
