package br.cassi.apibms.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="tb_lgpd")
public class LGPD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime dtRegistro;

    private boolean vigente;

    @Column(length=1500)
    private String descricaoLGPD;

    public LGPD() {
    }

    public LGPD(Integer id, LocalDateTime dtRegistro, boolean vigente, String descricaoLGPD) {
        this.id = id;
        this.dtRegistro = dtRegistro;
        this.vigente = vigente;
        this.descricaoLGPD = descricaoLGPD;
    }

}
