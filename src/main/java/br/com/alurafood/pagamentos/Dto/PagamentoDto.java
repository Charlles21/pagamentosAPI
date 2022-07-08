package br.com.alurafood.pagamentos.Dto;

import java.math.BigDecimal;

import br.com.alurafood.pagamentos.Model.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PagamentoDto {
   
    private Long id;   
    private BigDecimal valor;   
    private String nome;  
    private String numero; 
    private String expiracao;  
    private String codigo;  
    private Status status;
    private Long pedidoID;
    private Long formaDePagamentoId;
}
