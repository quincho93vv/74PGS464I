package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Seguimiento")
public class Seguimiento {

    @DatabaseField
    private double peso;
    @DatabaseField
    private double imc;
    @DatabaseField
    private double grasa;
    @DatabaseField
    private double pecho;
    @DatabaseField
    private double espalda;
    @DatabaseField
    private double cadera;
    @DatabaseField
    private double gluteos;
    @DatabaseField
    private double cintura;
    @DatabaseField
    private double pierna_izquierda;
    @DatabaseField
    private double pierna_derecha;
    @DatabaseField
    private double pantorrilla_izquierda;
    @DatabaseField
    private double pantorrilla_derecha;
    @DatabaseField
    private double brazo_izquierdo;
    @DatabaseField
    private double brazo_derecho;
    @DatabaseField
    private double antebrazo_derecho;
    @DatabaseField
    private String fecha;
    @DatabaseField(generatedId = true)
    private int seg_id;
    private double antebrazo_izquierdo;
    @DatabaseField(foreign = true, columnName = "id_cliente")
    private Cliente cliente;

    public Seguimiento() {
        cliente = new Cliente();
    }

    public void setDatosSeguimiento(
            double peso, double imc,
            double grasa, double pecho,
            double espalda, double cadera,
            double gluteos, double cintura,
            double pierna_izquierda, double pierna_derecha,
            double pantorrilla_izquierda, String fecha,
            double pantorrilla_derecha, double brazo_izquierdo,
            double brazo_derecho, double antebrazo_derecho,
            double antebrazo_izquierdo, Cliente cliente) {
        this.fecha = fecha;
        this.peso = peso;
        this.imc = imc;
        this.grasa = grasa;
        this.pecho = pecho;
        this.espalda = espalda;
        this.cadera = cadera;
        this.gluteos = gluteos;
        this.cintura = cintura;
        this.pierna_izquierda = pierna_izquierda;
        this.pierna_derecha = pierna_derecha;
        this.pantorrilla_izquierda = pantorrilla_izquierda;
        this.pantorrilla_derecha = pantorrilla_derecha;
        this.brazo_izquierdo = brazo_izquierdo;
        this.brazo_derecho = brazo_derecho;
        this.antebrazo_derecho = antebrazo_derecho;
        this.antebrazo_izquierdo = antebrazo_izquierdo;
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double getGrasa() {
        return grasa;
    }

    public void setGrasa(double grasa) {
        this.grasa = grasa;
    }

    public double getPecho() {
        return pecho;
    }

    public void setPecho(double pecho) {
        this.pecho = pecho;
    }

    public double getEspalda() {
        return espalda;
    }

    public void setEspalda(double espalda) {
        this.espalda = espalda;
    }

    public double getCadera() {
        return cadera;
    }

    public void setCadera(double cadera) {
        this.cadera = cadera;
    }

    public double getGluteos() {
        return gluteos;
    }

    public void setGluteos(double gluteos) {
        this.gluteos = gluteos;
    }

    public double getCintura() {
        return cintura;
    }

    public void setCintura(double cintura) {
        this.cintura = cintura;
    }

    public double getPierna_izquierda() {
        return pierna_izquierda;
    }

    public void setPierna_izquierda(double pierna_izquierda) {
        this.pierna_izquierda = pierna_izquierda;
    }

    public double getPierna_derecha() {
        return pierna_derecha;
    }

    public void setPierna_derecha(double pierna_derecha) {
        this.pierna_derecha = pierna_derecha;
    }

    public double getPantorrilla_izquierda() {
        return pantorrilla_izquierda;
    }

    public void setPantorrilla_izquierda(double pantorrilla_izquierda) {
        this.pantorrilla_izquierda = pantorrilla_izquierda;
    }

    public double getPantorrilla_derecha() {
        return pantorrilla_derecha;
    }

    public void setPantorrilla_derecha(double pantorrilla_derecha) {
        this.pantorrilla_derecha = pantorrilla_derecha;
    }

    public double getBrazo_izquierdo() {
        return brazo_izquierdo;
    }

    public void setBrazo_izquierdo(double brazo_izquierdo) {
        this.brazo_izquierdo = brazo_izquierdo;
    }

    public double getBrazo_derecho() {
        return brazo_derecho;
    }

    public void setBrazo_derecho(double brazo_derecho) {
        this.brazo_derecho = brazo_derecho;
    }

    public double getAntebrazo_derecho() {
        return antebrazo_derecho;
    }

    public void setAntebrazo_derecho(double antebrazo_derecho) {
        this.antebrazo_derecho = antebrazo_derecho;
    }

    public double getAntebrazo_izquierdo() {
        return antebrazo_izquierdo;
    }

    public void setAntebrazo_izquierdo(double antebrazo_izquierdo) {
        this.antebrazo_izquierdo = antebrazo_izquierdo;
    }

}
