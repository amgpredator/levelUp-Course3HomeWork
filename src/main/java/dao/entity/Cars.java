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
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="car__id_seq")
    @SequenceGenerator(name="car__id_seq",sequenceName="car__id_seq",allocationSize=1)
    private Long carId;

    @Column(name = "car_brand",nullable = false, unique = true)
    private String carBrand;

    @Column(name = "car_model",nullable = false)
    private String carModel;

    @Column(name = "car_year_manufactures",nullable = false)
    private Integer carYearManufactures;

    @Column(name = "car_country",nullable = false)
    private String carCountry;

    @Column(name = "car_color",nullable = false)
    private String carColor;

    @Column(name = "car_volume_engine",nullable = false)
    private Double carVolumeEngine;

    @Column(name = "car_cost")
    private BigDecimal carCost;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "detailId")
    private List<CarDetails> carDetails;

    public Cars() {
    }

    public Cars(String carBrand, String carModel, Integer carYearManufactures, String carCountry, String carColor, Double carVolumeEngine, BigDecimal carCost) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYearManufactures = carYearManufactures;
        this.carCountry = carCountry;
        this.carColor = carColor;
        this.carVolumeEngine = carVolumeEngine;
        this.carCost = carCost;
            }
}
