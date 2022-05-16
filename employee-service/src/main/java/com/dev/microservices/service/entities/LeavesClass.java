package com.dev.microservices.service.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(uniqueConstraints = @UniqueConstraint( name = "un_class", columnNames = {
        "leave_id", "employee_id", "date"
}))
public class LeavesClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_class_employee"))
    @NotNull
    @NonNull
    private Employee employee;

    @ManyToMany
    @JoinTable(
            foreignKey = @ForeignKey(name = "fk_class_leaves"),
            inverseForeignKey = @ForeignKey(name = "fk_employee_leaves")
    )
    @NonNull private List<Leaves> leaves;
    @NonNull private String date;


}
