package br.com.strolker.migracaodados.writer;

import javax.sql.DataSource;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.strolker.migracaodados.dominio.DadosBancarios;

@Configuration
public class BancoDadosBancariosWriteConfig {

	@Bean
	public JdbcBatchItemWriter<DadosBancarios> bancoDadosBancariosWriter(
				@Qualifier("appDataSource") DataSource dataSource
			){
		return new JdbcBatchItemWriterBuilder<DadosBancarios>()
				.dataSource(dataSource)
				.sql("INSERT INTO dados_bancarios (id, id_pessoa, agencia, conta, banco) VALUES(?, ?, ?, ?, ?)")
				.itemPreparedStatementSetter(itemPreparedStatementSetter())
				.build();
		
	}

	private ItemPreparedStatementSetter<DadosBancarios> itemPreparedStatementSetter() {
		return (dadosBancarios, ps) -> {
			ps.setInt(1, dadosBancarios.getId());
			ps.setInt(2, dadosBancarios.getIdPessoa());
			ps.setInt(3, dadosBancarios.getAgencia());
			ps.setInt(4, dadosBancarios.getConta());
			ps.setInt(5, dadosBancarios.getBanco());
		};
	}
}
