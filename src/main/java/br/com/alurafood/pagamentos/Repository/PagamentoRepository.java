package br.com.alurafood.pagamentos.Repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alurafood.pagamentos.Dto.PagamentoDto;
import br.com.alurafood.pagamentos.Model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{

    Page<PagamentoDto> findAll(Pageable paginacao);



    
    
}
