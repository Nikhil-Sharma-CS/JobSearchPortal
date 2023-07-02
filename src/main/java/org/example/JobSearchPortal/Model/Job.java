package org.example.JobSearchPortal.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Jobs")
public class Job {

    @Id
    private Long id;

    private String title;
    private String description;
    private String location;

    @Min(value = 20000, message = "Salary should be greater than 19999")
    private Double salary;

    @Email(message = "Please Provide a valid Email")
    private String companyEmail;

    private String companyName;
    private String employerName;

    @Enumerated(EnumType.STRING)
    private JobType jobType;
}
