package com.jozef507.employee.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="component_type", discriminatorType = DiscriminatorType.STRING)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Department.class, name = "Department"),
        @JsonSubTypes.Type(value = EmploymentRelationship.class, name = "EmploymentRelationship") }
)
public abstract class Component implements IComponent{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long componentId;

    @ManyToOne
    private Department parent;

}
