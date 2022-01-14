package br.cassi.apibms.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="tb_participante")
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer handleParticipante;

    @ManyToOne
    @JoinColumn(name = "")
    private ParticipanteLGPD participanteLGPD;


    public Participante() {
    }

}
