package com.jozef507.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="component_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Component implements IComponent{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long componentId;

}
