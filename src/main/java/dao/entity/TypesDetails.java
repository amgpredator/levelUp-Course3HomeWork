package dao.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "types_details")
@Getter
@Setter
public class TypesDetails {

    @Id
    @GeneratedValue
    private Long typeId;

    @Column(name = "name_type")
    private String nameType;

    public TypesDetails() {
    }

    public TypesDetails(String nameType) {
        this.nameType = nameType;
    }
}
