package betamovie.betamovie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "tbl_GeneralSetting")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GeneralSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "BreakTime")
    private Date breakTime;
    @Column(name = "BusinessHours")
    private int businessHours;
    @Column(name = "CloseTime")
    private Date closeTime;
    @Column(name = "FixTicketPrice")
    private double fixTicketPrice;
    @Column(name = "PercentDay")
    private int percentDay;
    @Column(name = "PercentWeekend")
    private int percentWeekend;

    @Column(name = "TimeBeginToChange")
    private Date timeBeginToChange;
}
