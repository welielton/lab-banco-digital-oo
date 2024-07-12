import java.util.Date;

public class Transacao {
    private String tipo;
    private double valor;
    private Date data;

    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = new Date();  // Define a data e hora atuais
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "tipo='" + tipo + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}
