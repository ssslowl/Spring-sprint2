package com.ssslowl.sprint2.SprintTask.entity;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "application_requests")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ApplicationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "courseName")
    private String courseName;

    @Column(name = "commentary")
    private String commentary;

    @Column(name = "phone")
    private String phone;

    @Column(name = "handled")
    private Boolean handled = false;
}
