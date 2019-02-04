package dao.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "car")
@Getter
@Setter
@NoArgsConstructor
public class Cars {

    @Id
    @GeneratedValue
    private Long carId;

    @Column(name = "car_brand")
    private String carBrand;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_year_manufactures")
    private Date carYearManufactures;

    @Column(name = "car_country")
    private String carCountry;

    @Column(name = "car_color")
    private String carColor;

    @Column(name = "car_volume_engine")
    private Double carVolumeEngine;

    @Column(name = "car_cost")
    private BigDecimal carCost;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "detailId")
    private List<CarDetails> carDetails;


}
