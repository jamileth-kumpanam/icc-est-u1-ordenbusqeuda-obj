package Models;

public class Direccion {
    private String calle;
    private int numero;
    private int codigo;

    public Direccion(String calle, int numero, int codigo) {
        this.calle = calle;
        this.numero = numero;
        this.codigo = codigo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return calle + " #" + numero + " [Código: " + codigo + "]";
    }
}

