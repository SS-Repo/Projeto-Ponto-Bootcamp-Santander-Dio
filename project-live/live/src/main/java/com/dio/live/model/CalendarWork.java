package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class CalendarWork {
    //Calendario
    //Implementacao Futura: API Com Todos os Feriados
    @Id
    private Long id;

    @ManyToOne
    private DateType dateType;
    private String description;
    private LocalDateTime specialDate;

}
