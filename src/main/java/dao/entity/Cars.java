package dao.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "car")
@Getter
@Setter
@NoArgsConstructor
public class Cars {

    @Id
    private Long carId;

    @Column(name = "car_brand")
    private String carBrand;

    @Column(name = "car_year_manufactures")
    private Date carYearManufactures;

    @Column(name = "car_country")
    private String carCountry;

    @Column(name = "car_color")
    private String carColor;

    @Column(name = "car_cost")
    private BigDecimal carCost;


}
