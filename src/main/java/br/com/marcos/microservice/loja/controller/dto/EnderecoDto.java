package br.com.marcos.microservice.loja.controller.dto;

import java.util.Objects;

public class EnderecoDto {

    private String rua;

    private int numero;

    private String estado;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnderecoDto that = (EnderecoDto) o;
        return numero == that.numero &&
                Objects.equals(rua, that.rua) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rua, numero, estado);
    }

    @Override
    public String toString() {
        return "rua='" + rua + '\'' +
                ", numero=" + numero +
                ", estado='" + estado + '\'';
    }
}
