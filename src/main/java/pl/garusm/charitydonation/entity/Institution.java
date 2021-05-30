package pl.garusm.charitydonation.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "institutions")
public class Institution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

}
