package codoacodo.example.codo.Entities.DTOS.PackFormDTO;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="opciondto")
public class OpcionDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;

    private String fechaM = new Date().toGMTString();

    @ManyToOne
    @JoinColumn(name = "preguntaid" )
    private PreguntaDTO pregunta;

    public OpcionDTO() {
    }

    public OpcionDTO(Long id, String descripcion, String fechaM, PreguntaDTO pregunta) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaM = fechaM;
        this.pregunta = pregunta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaM() {
        return fechaM;
    }

    public void setFechaM(String fechaM) {
        this.fechaM = fechaM;
    }

    public PreguntaDTO getPregunta() {
        return pregunta;
    }

    public void setPregunta(PreguntaDTO pregunta) {
        this.pregunta = pregunta;
    }
}
