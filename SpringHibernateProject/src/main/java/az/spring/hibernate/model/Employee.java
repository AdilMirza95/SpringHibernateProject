package az.spring.hibernate.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "Employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name",length = 25)
    private String name;
    @Column(name = "surname",length = 35)
    private String surname;
    private int age;
    private double salary;

}
