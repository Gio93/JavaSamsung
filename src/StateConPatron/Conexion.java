package StateConPatron;


public class Conexion {
    private State state;
    private Emisor emisor;

    public Conexion() {
        this.state = new StateCerrado();
    }

    public Emisor getEmisor() {
        return emisor;
    }

    public void setEmisor(Emisor emisor) {
        this.emisor = emisor;
    }

    protected void setState(State state){
    	this.state=state;
    }
    public Estado estado() {
        return this.state.estado();
    }

    public void abrir() {
        /*if (this.estado == Estado.CERRADO) {
            this.estado = Estado.PREPARADO;
        } else if (this.estado == Estado.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PREPARADO) {

        } else
            assert false : "estado imposible";*/
    	state.abrir(this);
    }

    public void cerrar() {
       /* if (this.estado == Estado.CERRADO) {
        } else if (this.estado == Estado.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PREPARADO) {
            this.estado = Estado.CERRADO;
        } else
            assert false : "estado imposible";*/
    	state.cerrar(this);
    }

    public void parar() {
       /* if (this.estado == Estado.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PARADO) {
        } else if (this.estado == Estado.PREPARADO) {
            this.estado = Estado.PARADO;
        } else
            assert false : "estado imposible";*/
    	state.parar(this);
    }

    public void iniciar() {
      /*  if (this.estado == Estado.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PARADO) {
            this.estado = Estado.PREPARADO;
        } else if (this.estado == Estado.PREPARADO) {
        } else
            assert false : "estado imposible";*/
    	state.iniciar(this);
    }

    public void enviar(String msg) {
       /* if (this.estado == Estado.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PREPARADO) {
            this.emisor.enviar(msg);
        } else
            assert false : "estado imposible";*/
    	state.enviar(this.emisor, msg);
    }

}