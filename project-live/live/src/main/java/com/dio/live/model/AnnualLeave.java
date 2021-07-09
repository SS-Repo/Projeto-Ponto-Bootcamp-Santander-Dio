package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
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
public class AnnualLeave {
    //Banco de Horas
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class AnnualLeaveId implements Serializable {
        private Long idAnnualLeave;
        private Long idMovement;
        private Long idUser;
    }

    @EmbeddedId
    private AnnualLeaveId id;
    private LocalDateTime dateWork;
    //Quantidade de horas trabalhadas
    private BigDecimal numberHoursWorked;
    //Saldos de horas trabalhadas
    private BigDecimal balanceHoursWorked;
}
