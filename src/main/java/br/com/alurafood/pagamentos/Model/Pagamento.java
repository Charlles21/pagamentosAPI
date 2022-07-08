package br.com.alurafood.pagamentos.Model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="pgamentos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pagamento {

    //2 anotaçoes geram o id completamento aleatoria e acrescenta uma identidade a esta id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @NotNull
    @Positive
    private BigDecimal valor;
    @NotBlank
    //tamanho maximo 100 caracteres
    @Size(max=100)
    private String nome;
    @NotBlank
    @Size(max=19)
    private String numero;
    @Size(max=7)
    private String expiracao;
    @NotBlank
    @Size(min = 3, max = 3)
    private String codigo;
    @NotNull
    //anotaçao usada para se referir ao enum obrigatorio ter
    @Enumerated(EnumType.STRING)
    private Status status;
    @NotNull
    private Long pedidoID;
    @NotNull
    private Long formaDePagamentoId;

    
}
