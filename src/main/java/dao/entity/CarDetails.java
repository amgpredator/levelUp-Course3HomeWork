package dao.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "car_detail")
@NoArgsConstructor
public class CarDetails {

    @Id
    @GeneratedValue
    private Long detailId;

    @Column(name = "name_detail")
    private String nameDetail;

    @Column(name = "type_detail")
    private String typeDetail;

    @Column(name = "detail_cost")
    private BigDecimal detailCost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carId")
    private Cars cars;


}
