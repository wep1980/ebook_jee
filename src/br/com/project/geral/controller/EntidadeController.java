package br.com.project.geral.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.framework.implementacao.crud.ImplementacaoCrud;
import br.com.framework.interfac.crud.InterfaceCrud;
import br.com.project.enums.TipoCadastro;
import br.com.project.model.classes.Entidade;
import br.com.srv.interfaces.SrvEntidade;

@Controller
public class EntidadeController extends ImplementacaoCrud<Entidade> implements
		InterfaceCrud<Entidade> {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private SrvEntidade srvEntidade;

	public Entidade findUserLogado(String userLogado) throws Exception {
		return super.findUninqueByProperty(Entidade.class, userLogado,
				"ent_login", " and entity.ent_inativo is false ");
	}

	public Date getUltimoAcessoEntidadeLogada(String login) {
		return srvEntidade.getUltimoAcessoEntidadeLogada(login);
	}

	public void updateUltimoAcessoUser(String login) {
		srvEntidade.updateUltimoAcessoUser(login);
	}

	public Entidade findVendedor(Long codVendedor) throws Exception {
		return findUninqueByPropertyId(Entidade.class, codVendedor,
				"ent_codigo", " and entity.ent_inativo is false and entity.ent_tipo = '"
						+ TipoCadastro.TIPO_CADASTRO_VENDEDOR.name() + "' ");
	}

	public Entidade findContrutora(Long codConstrutora) throws Exception {
		return findUninqueByPropertyId(Entidade.class, codConstrutora,
				"ent_codigo", " and entity.ent_inativo is false and entity.ent_tipo = '"
						+ TipoCadastro.TIPO_CADASTRO_CONSTRUTORA.name() + "' ");
	}

	public Entidade findFuncionario(Long codEntidade) throws Exception {
		return findUninqueByPropertyId(Entidade.class, codEntidade,
				"ent_codigo", " and entity.ent_inativo is false and entity.ent_tipo = '"
						+ TipoCadastro.TIPO_CADASTRO_FUNCIONARIO.name() + "'");
	}

	public Entidade findCliente(Long codCliente) throws Exception {
		return findUninqueByPropertyId(Entidade.class, codCliente,
				"ent_codigo", " and entity.ent_inativo is false and entity.ent_tipo = '"
						+ TipoCadastro.TIPO_CADASTRO_CLIENTE.name() + "'");
	}

	public Entidade findFornecedor(Long codFornecedor) throws Exception {
		return findUninqueByPropertyId(Entidade.class, codFornecedor,
				"ent_codigo", " and entity.ent_inativo is false and entity.ent_tipo = '"
						+ TipoCadastro.TIPO_CADASTRO_CLIENTE.name() + "'");
	}

	public boolean existeUsuario(String ent_login) {
		return srvEntidade.existeUsuario(ent_login);
	}

}
