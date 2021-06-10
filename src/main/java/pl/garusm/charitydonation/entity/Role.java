package pl.garusm.charitydonation.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int id;

    @Column(length = 60)
    private String email;

    @Column(length = 30)
    private String role;

}


