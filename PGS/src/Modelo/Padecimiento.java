package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import javax.swing.JList;
@DatabaseTable(tableName = "RegistroPadecimiento")
public class Padecimiento {

    @DatabaseField
    private String presion;
    @DatabaseField
    private String problemas_cardiacos;
    @DatabaseField
    private String dificultad_act_fisica;
    @DatabaseField
    private String discapacidad;
    @DatabaseField
    private String enfermedad_cronica;
    @DatabaseField
    private String rehabilitacion;
    @DatabaseField
    private String zona_lesion;
    @DatabaseField
    private String zona_hernia;
    @DatabaseField
    private String zona_quebradura;
    @DatabaseField
    private String problema_espalda;
    @DatabaseField
    private String cirujia;
    @DatabaseField
    private String embarazo;
    @DatabaseField
    private String post_embarazo;
    @DatabaseField
    private String problemas_respiratorios;
    @DatabaseField
    private String diabetes;
    @DatabaseField
    private String fumado;
    @DatabaseField
    private String obesidad;
    @DatabaseField
    private String problemas_emocionales;
    @DatabaseField
    private String colesterol;
    @DatabaseField
    private String gastritis;
    @DatabaseField
    private String ulceras;
    @DatabaseField
    private String colitis;
    @DatabaseField
    private String mareos_vomitos;
    @DatabaseField
    private String otros;
     @DatabaseField(id = true,  columnName = "id_pade")
    private String  id_pade;
    @DatabaseField(foreign = true,  columnName = "id_cliente")
    private Cliente cliente;

    public Padecimiento() {
    }

    public Padecimiento(String presion, String discapacidad, String enfermedad_cronica, String zona_lesion,
            String zona_hernia, String zona_quebradura, String embarazo, String post_embarazo, String otros, Cliente cliente) {
        this.presion = presion;
        this.discapacidad = discapacidad;
        this.enfermedad_cronica = enfermedad_cronica;
        this.zona_lesion = zona_lesion;
        this.zona_hernia = zona_hernia;
        this.zona_quebradura = zona_quebradura;
        this.embarazo = embarazo;
        this.post_embarazo = post_embarazo;
        this.otros = otros;
        this.cliente = cliente;
        id_pade= cliente.getId_cliente();
        this.problemas_cardiacos = "false";
        this.dificultad_act_fisica = "false";
        this.rehabilitacion = "false";
        this.problema_espalda ="false";
        this.cirujia = "false";
        this.problemas_respiratorios = "false";
        this.diabetes = "false";
        this.fumado = "false";
        this.obesidad ="false";
        this.problemas_emocionales = "false";
        this.gastritis ="false";
        this.ulceras = "false";
        this.colitis = "false";
        this.mareos_vomitos = "false";
        this.colesterol = "false";
    }

    public String getId_pade() {
        return id_pade;
    }

    public void setAtributos(JList j) {
      j.getSelectedValuesList().stream().forEach((a)->
              this.seteaElQueEsta(a.toString())
      );
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public String getProblemas_cardiacos() {
        return problemas_cardiacos;
    }

    public void setProblemas_cardiacos(String problemas_cardiacos) {
        this.problemas_cardiacos = problemas_cardiacos;
    }

    public String getDificultad_act_fisica() {
        return dificultad_act_fisica;
    }

    public void setDificultad_act_fisica(String dificultad_act_fisica) {
        this.dificultad_act_fisica = dificultad_act_fisica;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getEnfermedad_cronica() {
        return enfermedad_cronica;
    }

    public void setEnfermedad_cronica(String enfermedad_cronica) {
        this.enfermedad_cronica = enfermedad_cronica;
    }

    public String getRehabilitacion() {
        return rehabilitacion;
    }

    public void setRehabilitacion(String rehabilitacion) {
        this.rehabilitacion = rehabilitacion;
    }

    public String getZona_lesion() {
        return zona_lesion;
    }

    public void setZona_lesion(String zona_lesion) {
        this.zona_lesion = zona_lesion;
    }

    public String getZona_hernia() {
        return zona_hernia;
    }

    public void setZona_hernia(String zona_hernia) {
        this.zona_hernia = zona_hernia;
    }

    public String getZona_quebradura() {
        return zona_quebradura;
    }

    public void setZona_quebradura(String zona_quebradura) {
        this.zona_quebradura = zona_quebradura;
    }

    public String getProblema_espalda() {
        return problema_espalda;
    }

    public void setProblema_espalda(String problema_espalda) {
        this.problema_espalda = problema_espalda;
    }

    public String getCirujia() {
        return cirujia;
    }

    public void setCirujia(String cirujia) {
        this.cirujia = cirujia;
    }

    public String getEmbarazo() {
        return embarazo;
    }

    public void setEmbarazo(String embarazo) {
        this.embarazo = embarazo;
    }

    public String getPost_embarazo() {
        return post_embarazo;
    }

    public void setPost_embarazo(String post_embarazo) {
        this.post_embarazo = post_embarazo;
    }

    public String getProblemas_respiratorios() {
        return problemas_respiratorios;
    }

    public void setProblemas_respiratorios(String problemas_respiratorios) {
        this.problemas_respiratorios = problemas_respiratorios;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getFumado() {
        return fumado;
    }

    public void setFumado(String fumado) {
        this.fumado = fumado;
    }

    public String getObesidad() {
        return obesidad;
    }

    public void setObesidad(String obesidad) {
        this.obesidad = obesidad;
    }

    public String getProblemas_emocionales() {
        return problemas_emocionales;
    }

    public void setProblemas_emocionales(String problemas_emocionales) {
        this.problemas_emocionales = problemas_emocionales;
    }

    public String getColesterol() {
        return colesterol;
    }

    public void setColesterol(String colesterol) {
        this.colesterol = colesterol;
    }

    public String getGastritis() {
        return gastritis;
    }

    public void setGastritis(String gastritis) {
        this.gastritis = gastritis;
    }

    public String getUlceras() {
        return ulceras;
    }

    public void setUlceras(String ulceras) {
        this.ulceras = ulceras;
    }

    public String getColitis() {
        return colitis;
    }

    public void setColitis(String colitis) {
        this.colitis = colitis;
    }

    public String getMareos_vomitos() {
        return mareos_vomitos;
    }

    public void setMareos_vomitos(String mareos_vomitos) {
        this.mareos_vomitos = mareos_vomitos;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    private void seteaElQueEsta(String x) {
        switch (x) {
            case "Cirujía":
                this.cirujia= "true";
                break;
            case "Problemas respiratorios":
                this.problemas_respiratorios="true";
                break;
            case "Diabetes":
                  this.diabetes="true";
                break;
            case "Hábitos de fumado":
                this.fumado="true";
                break;
            case "Obesidad":
                this.obesidad="true";
                break;
            case "Padecimientos nerviosos":
                this.problemas_emocionales="true";
                break;
            case "Colesterol":
                this.colesterol="true";
                break;
            case "Gastritis":
                this.gastritis="true";
                break;
            case "Úlceras":
                this.ulceras="true";
                break;
            case "Colitis":
                this.colitis="true";
                break;
            case "Problemas de espalda":
                this.problema_espalda="true";
                break;
            case "Rehabilitación":
                this.rehabilitacion="true";
                break;
            case "Antecedentes cardíacos":
                this.problemas_cardiacos="true";
                break;
            case "Dificultad actividad física":
                this.dificultad_act_fisica="true";
                break;
            default:
                break;
        }
    }

}
