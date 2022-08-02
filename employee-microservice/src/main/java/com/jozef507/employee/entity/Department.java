package com.jozef507.employee.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@DiscriminatorValue("department")
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="componentId")
public class Department extends Component {

    private String name;

    private String description;

    @OneToMany(mappedBy="parent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Component> components = new ArrayList<>();



    public void calculateSalary(){

    }
}
