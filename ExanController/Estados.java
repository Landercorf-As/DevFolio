
class Estados {

    private final int intentosRepetidos;
    private final int tiempo;
    private final int progreso;
    private final String estado;

    public Estados(int intentosRepetidos, int tiempo, int progreso, String estado) {
        this.intentosRepetidos = intentosRepetidos;
        this.tiempo = tiempo;
        this.progreso = progreso;
        this.estado = estado;
    }

    public int getIntentosRepetidos() {
        return intentosRepetidos;
    }

    public int getTiempo() {
        return tiempo;
    }

    public int getProgreso() {
        return progreso;
    }

    public String getEstado() {
        return estado;
    }
}
