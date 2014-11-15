package br.com.tcc.bo;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.tcc.model.*;
import br.com.tcc.util.*;

import java.util.List;
import java.util.ArrayList;

public class SprintBOTest {
	
	   private static final String DT_INICIO_SPRINT = "08/09/2014";

	@Test
	public void testCalculaTotalHoras() throws Exception {
	
		SprintBO  sprintbo= new SprintBO();
		Sprint sprint = new Sprint();
		List<Estoria> estorias = new ArrayList<Estoria>();
		
		   Estoria est1 = new Estoria();
		   est1.setTempoEstimado(40);
		   est1.setCodEstoria(1);
		   est1.setQtdePontos(5);
		estorias.add(est1);
		sprint.setEstorias(estorias);
		
		List<ItemHistorico> itens = new ArrayList<ItemHistorico>();
		   ItemHistorico item = new ItemHistorico();
		   item.setCodEstoria(1);
		   item.setTempoGasto(34);
		   item.setData(DataUtil.converteStringParaDate(DT_INICIO_SPRINT));
		   
		   itens.add(item);
		   sprint.setItensHistorico(itens);
		   double valor = sprintbo.calculaTotalHoras(sprint);
		   assertEquals(6,0,valor);
	}
	
	
	@Test
	public void testCalculaTotalHoras3() throws Exception {
	
		SprintBO  sprintbo= new SprintBO();
		Sprint sprint = new Sprint();

		ItemHistorico item = new ItemHistorico();
		item.setCodEstoria(1);
		item.setTempoGasto(34);
		item.setData(DataUtil.converteStringParaDate(DT_INICIO_SPRINT));
		
		ItemHistorico item2 = new ItemHistorico();
		item2.setCodEstoria(2);
		item2.setTempoGasto(18);
		item2.setData(DataUtil.converteStringParaDate("09/09/2014"));
		
		ItemHistorico item3 = new ItemHistorico();
		item3.setCodEstoria(3);
		item3.setTempoGasto(15);
		item3.setData(DataUtil.converteStringParaDate("10/09/2014"));
		
		ItemHistorico item4 = new ItemHistorico();
		item4.setCodEstoria(3);
		item4.setTempoGasto(33);
		item4.setData(DataUtil.converteStringParaDate("11/09/2014"));

		ItemHistorico item5 = new ItemHistorico();
		item5.setCodEstoria(3);
		item5.setTempoGasto(3);
		item5.setData(DataUtil.converteStringParaDate("11/09/2014"));
		

		ItemHistorico item6 = new ItemHistorico();
		item6.setCodEstoria(3);
		item6.setTempoGasto(2);
		item6.setData(DataUtil.converteStringParaDate("11/09/2014"));
		

		ItemHistorico item7 = new ItemHistorico();
		item7.setCodEstoria(1);
		item7.setTempoGasto(6);
		item7.setData(DataUtil.converteStringParaDate("09/09/2014"));
		
		List<ItemHistorico> itens = new ArrayList<ItemHistorico>();
		itens.add(item);
		itens.add(item2);
		itens.add(item3);
		itens.add(item4);
		itens.add(item5);
		itens.add(item6);
		itens.add(item7);
		
		sprint.setItensHistorico(itens);
		
		List<Estoria> estorias = new ArrayList<Estoria>();
		
		Estoria est1 = new Estoria();
		est1.setTempoEstimado(40);
		est1.setCodEstoria(1);
		est1.setQtdePontos(5);

		Estoria est2 = new Estoria();
		est2.setTempoEstimado(32);
		est2.setCodEstoria(2);
		est2.setQtdePontos(3);
		
		Estoria est3 = new Estoria();
		est3.setTempoEstimado(10);
		est3.setCodEstoria(3);
		est3.setQtdePontos(1);
		
		Estoria est4 = new Estoria();
		est4.setTempoEstimado(88);
		est4.setCodEstoria(4);
		est4.setQtdePontos(8);
		
		estorias.add(est1);
		estorias.add(est2);
		estorias.add(est3);
		estorias.add(est4);
		
		sprint.setEstorias(estorias);
		   double valor = sprintbo.calculaTotalHoras(sprint);
		   assertEquals(140,0,valor);
	}
	
	@Test
	public void testCalculaTotalHoras2() throws Exception {
		
		SprintBO  sprintbo= new SprintBO();
		Sprint sprint = new Sprint();
		   double valor = sprintbo.calculaTotalHoras(sprint);
		   assertEquals(6,0,valor);
	}

	@Test
	public void testCalculaTotalPontos() throws Exception {
		
		SprintBO  sprintbo= new SprintBO();
		Sprint sprint = new Sprint();
		List<Estoria> estorias = new ArrayList<Estoria>();
		
		   Estoria est1 = new Estoria();
		   est1.setTempoEstimado(40);
		   est1.setCodEstoria(1);
		   est1.setQtdePontos(5);
		estorias.add(est1);
		sprint.setEstorias(estorias);
		
		List<ItemHistorico> itens = new ArrayList<ItemHistorico>();
		   ItemHistorico item = new ItemHistorico();
		   item.setCodEstoria(1);
		   item.setTempoGasto(34);
		   item.setData(DataUtil.converteStringParaDate(DT_INICIO_SPRINT));
		   
		   itens.add(item);
		   sprint.setItensHistorico(itens);
		   int valor = sprintbo.calculaTotalPontos(sprint);
		   assertEquals(5,valor);
	}
	
	@Test
	public void testCalculaTotalPontos2() throws Exception {
		
		SprintBO  sprintbo= new SprintBO();
		Sprint sprint = new Sprint();
		   int valor = sprintbo.calculaTotalPontos(sprint);
		   assertEquals(5,valor);
	}


	@Test
	public void testCalculaTotalPontos3() throws Exception {
	
		SprintBO  sprintbo= new SprintBO();
		Sprint sprint = new Sprint();

		ItemHistorico item = new ItemHistorico();
		item.setCodEstoria(1);
		item.setTempoGasto(34);
		item.setData(DataUtil.converteStringParaDate(DT_INICIO_SPRINT));
		
		ItemHistorico item2 = new ItemHistorico();
		item2.setCodEstoria(2);
		item2.setTempoGasto(18);
		item2.setData(DataUtil.converteStringParaDate("09/09/2014"));
		
		ItemHistorico item3 = new ItemHistorico();
		item3.setCodEstoria(3);
		item3.setTempoGasto(15);
		item3.setData(DataUtil.converteStringParaDate("10/09/2014"));
		
		ItemHistorico item4 = new ItemHistorico();
		item4.setCodEstoria(3);
		item4.setTempoGasto(33);
		item4.setData(DataUtil.converteStringParaDate("11/09/2014"));

		ItemHistorico item5 = new ItemHistorico();
		item5.setCodEstoria(3);
		item5.setTempoGasto(3);
		item5.setData(DataUtil.converteStringParaDate("11/09/2014"));
		

		ItemHistorico item6 = new ItemHistorico();
		item6.setCodEstoria(3);
		item6.setTempoGasto(2);
		item6.setData(DataUtil.converteStringParaDate("11/09/2014"));
		

		ItemHistorico item7 = new ItemHistorico();
		item7.setCodEstoria(1);
		item7.setTempoGasto(6);
		item7.setData(DataUtil.converteStringParaDate("09/09/2014"));
		
		List<ItemHistorico> itens = new ArrayList<ItemHistorico>();
		itens.add(item);
		itens.add(item2);
		itens.add(item3);
		itens.add(item4);
		itens.add(item5);
		itens.add(item6);
		itens.add(item7);
		
		sprint.setItensHistorico(itens);
		
		List<Estoria> estorias = new ArrayList<Estoria>();
		
		Estoria est1 = new Estoria();
		est1.setTempoEstimado(40);
		est1.setCodEstoria(1);
		est1.setQtdePontos(5);

		Estoria est2 = new Estoria();
		est2.setTempoEstimado(32);
		est2.setCodEstoria(2);
		est2.setQtdePontos(3);
		
		Estoria est3 = new Estoria();
		est3.setTempoEstimado(10);
		est3.setCodEstoria(3);
		est3.setQtdePontos(1);
		
		Estoria est4 = new Estoria();
		est4.setTempoEstimado(88);
		est4.setCodEstoria(4);
		est4.setQtdePontos(8);
		
		estorias.add(est1);
		estorias.add(est2);
		estorias.add(est3);
		estorias.add(est4);
		
		sprint.setEstorias(estorias);
		   int valor = sprintbo.calculaTotalPontos(sprint);
		   assertEquals(17,0,valor);
	}
}
