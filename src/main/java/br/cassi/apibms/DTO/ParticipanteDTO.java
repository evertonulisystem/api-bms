package br.cassi.apibms.DTO;


import br.cassi.apibms.models.Participante;

public class ParticipanteDTO {

    private Integer handleParticipante;

    public ParticipanteDTO() {
    }

    public ParticipanteDTO(Integer handleParticipante) {
        this.handleParticipante = handleParticipante;
    }

    public ParticipanteDTO(Participante participante) {
        this.handleParticipante = participante.getHandleParticipante();
    }


}
