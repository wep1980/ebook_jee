package br.com.project.geral.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import br.com.framework.implementacao.crud.ImplementacaoCrud;
import br.com.framework.interfac.crud.InterfaceCrud;
import br.com.project.model.classes.Produto;
import br.com.repository.interfaces.RepositoryProduto;
import br.com.srv.interfaces.SrvProduto;

@Controller
public class ProdutoController extends ImplementacaoCrud<Produto> implements
		InterfaceCrud<Produto> {
	private static final long serialVersionUID = 1L;
	@Resource
	private SrvProduto srvProduto;
	@Resource
	private RepositoryProduto repositoryProduto;

	public void setSrvProduto(SrvProduto srvProduto) {
		this.srvProduto = srvProduto;
	}

	public void setRepositoryProduto(RepositoryProduto repositoryProduto) {
		this.repositoryProduto = repositoryProduto;
	}

}
