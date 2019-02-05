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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="type_details_id_seq")
    @SequenceGenerator(name="type_details_id_seq",sequenceName="type_details_id_seq",allocationSize=1)
    private Long typeId;

    @Column(name = "name_type")
    private String nameType;

    public TypesDetails() {
    }

    public TypesDetails(String nameType) {
        this.nameType = nameType;
    }
}
