package br.cassi.apibms.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="tb_participantelgpd")
public class ParticipanteLGPD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime dtRegistro = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name="")
    private LGPD lgpd;



    public ParticipanteLGPD() {
    }



    }
