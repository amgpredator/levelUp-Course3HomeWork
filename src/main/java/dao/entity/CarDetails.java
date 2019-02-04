package dao.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "car_detail")
@Getter
@Setter
public class CarDetails {

    @Id
    @GeneratedValue
    private Long detailId;

    @Column(name = "name_detail",nullable = false, unique = true)
    private String nameDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "typeId")
    private TypesDetails typeDetail;

    @Column(name = "detail_cost")
    private BigDecimal detailCost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carId")
    private Cars cars;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contractorId")
    private Contractor contractor;

    public CarDetails() {
    }

    public CarDetails(String nameDetail, TypesDetails typeDetail, BigDecimal detailCost, Cars cars, Contractor contractor) {
        this.nameDetail = nameDetail;
        this.typeDetail = typeDetail;
        this.detailCost = detailCost;
        this.cars = cars;
        this.contractor = contractor;
    }
}
