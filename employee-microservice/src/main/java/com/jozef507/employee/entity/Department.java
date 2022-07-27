package com.jozef507.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@DiscriminatorValue("department")
//@JsonTypeName("Department")
public class Department extends Component {

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;*/
    private String name;
    private String description;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "department_department_id")
    private List<Component> components = new ArrayList<>();
    @ManyToOne
    private Component parent;

    public void calculateSalary(){

    }
}
