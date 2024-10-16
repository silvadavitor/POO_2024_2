package Questao2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Movimento {
    private double valor;
    private LocalDate data;
    private LocalTime hora;
    private TipoMovimento tipoMovimento;

    public Movimento(double valor, TipoMovimento tipo) {
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
        this.valor = valor;
        this.tipoMovimento = tipo; 
    }
    
    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }
}
