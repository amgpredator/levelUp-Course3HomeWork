package dao.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "contractor")
@Getter
@Setter
@NoArgsConstructor
public class Contractor {

    @Id
    @GeneratedValue
    private Long contractorId;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;
}
