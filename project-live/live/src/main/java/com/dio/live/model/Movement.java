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
public class Movement {
    //Movimentação
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovementId implements Serializable {
        private Long idMovement;
        private Long idUser;
    }
    @EmbeddedId
    private MovementId id;
    //Data entrada
    private LocalDateTime dateEntry;
    //Data saida
    private LocalDateTime dateDeparture;
    //Periodo
    private BigDecimal timeCourse;
    @ManyToOne
    private Occurrence occurrence;
    @ManyToOne
    private CalendarWork calendarWork;
}
