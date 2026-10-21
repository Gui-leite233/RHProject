package Funcionario;

import java.time.LocalDate;
import java.time.LocalTime;

public interface Funcionarios{
    LocalDate dia = null;
    LocalTime dataEntrada = null;
    LocalTime dataSaida = null;
    default void registrarHoras(LocalDate dia, LocalTime dataEntrada, LocalTime dataSaida){

    }
}
