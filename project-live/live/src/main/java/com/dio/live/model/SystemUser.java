package com.dio.live.model;

import jdk.jfr.Category;
import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class SystemUser {
    //Usuario
    @Id
    private Long id;
    @ManyToOne
    private UserCategory userCategory;
    private String name;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private WorkingDay workingDay;
    //tolerancia
    private BigDecimal tolerance;
    //jornanda de trabalho
    private LocalDateTime startJorney;
    private LocalDateTime endJorney;


}
