package com.binde.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    //validation
    @NotBlank(message = "please add the department name")
//    @Length(max = 10, min = 5)
//    @Size(max = 5, min = 3)
//    @Email(message ="email is not valid")
//    @Negative
//    @Positive
//    @PositiveOrZero
//    @Future
//    @FutureOrPresent
    private String departmentName;
    private String departmentAddress;
    private Integer departmentCode;
}
