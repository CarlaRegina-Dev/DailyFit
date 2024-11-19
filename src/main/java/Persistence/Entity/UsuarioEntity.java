package Persistence.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String senha;
    private Integer idade;
    private BigDecimal peso;
    private BigDecimal altura;
    @Column(nullable = false)
    private String gnero;
    private String restricoesAlimentares;
    private String preferenciaaAlimentares;
    private LocalDateTime dataHoraCadastro;
    private LocalDateTime dataHoraManutencao;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public String getGnero() {
        return gnero;
    }

    public void setGnero(String gnero) {
        this.gnero = gnero;
    }

    public String getRestricoesAlimentares() {
        return restricoesAlimentares;
    }

    public void setRestricoesAlimentares(String restricoesAlimentares) {
        this.restricoesAlimentares = restricoesAlimentares;
    }

    public String getPreferenciaaAlimentares() {
        return preferenciaaAlimentares;
    }

    public void setPreferenciaaAlimentares(String preferenciaaAlimentares) {
        this.preferenciaaAlimentares = preferenciaaAlimentares;
    }

    public LocalDateTime getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(LocalDateTime dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public LocalDateTime getDataHoraManutencao() {
        return dataHoraManutencao;
    }

    public void setDataHoraManutencao(LocalDateTime dataHoraManutencao) {
        this.dataHoraManutencao = dataHoraManutencao;
    }
}
