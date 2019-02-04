package dao.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contractor")
@Getter
@Setter
public class Contractor {

    @Id
    @GeneratedValue
    private Long contractorId;

    @Column(name = "name",nullable = false, unique = true)
    private String name;

    @Column(name = "country",nullable = false)
    private String country;

    @Column(name = "address",nullable = false)
    private String address;

    @Column(name = "phone",nullable = false, unique = true)
    private String phone;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "detailId")
    private List<CarDetails> carDetails;

    public Contractor() {
    }

    public Contractor(String name, String country, String address, String phone) {
        this.name = name;
        this.country = country;
        this.address = address;
        this.phone = phone;
    }
}
