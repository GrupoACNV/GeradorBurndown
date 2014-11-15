package br.com.tcc.bo;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import java.util.LinkedHashMap;
import br.com.tcc.model.*;
import br.com.tcc.util.*;
import java.util.Map;

public class BurndownBOTest {
	   private static final String DT_INICIO_SPRINT = "08/09/2014";

	@Test
	public void testEixoXYHoras() throws Exception {
		fail("Not yet implemented");
		Sprint sprintTest = new Sprint();
		BurndownBO burn = new BurndownBO();
		sprintTest.setQtdeDias(3);
		
		List<Estoria> estorias = new ArrayList<Estoria>();
		
		Estoria est1 = new Estoria();
		est1.setTempoEstimado(40);
		est1.setCodEstoria(1);
		est1.setQtdePontos(5);

		Estoria est2 = new Estoria();
		est2.setTempoEstimado(32);
		est2.setCodEstoria(2);
		est2.setQtdePontos(3);
		
		estorias.add(est1);
		estorias.add(est2);
		sprintTest.setEstorias(estorias);
		
		List<ItemHistorico> itens = new ArrayList<ItemHistorico>();
		ItemHistorico item = new ItemHistorico();
		item.setCodEstoria(1);
		item.setTempoGasto(34);
		item.setData(DataUtil.converteStringParaDate(DT_INICIO_SPRINT));

		ItemHistorico item2 = new ItemHistorico();
		item2.setCodEstoria(2);
		item2.setTempoGasto(18);
		item2.setData(DataUtil.converteStringParaDate("09/09/2014"));
		
			
		itens.add(item);
		itens.add(item2);
		sprintTest.setItensHistorico(itens);
		
		Map<Date,Double> Esperado = new LinkedHashMap<Date,Double>();
		Esperado.put(DataUtil.converteStringParaDate("08/09/2014"),34.0);
		Esperado.put(DataUtil.converteStringParaDate("09/09/2014"), 18.0);
		
		
		Map<Date,Double> calculado = burn.calculaEixosXYHoras(sprintTest);
		assertEquals(Esperado, calculado);
	}
	@Test
	public void testEixoXYPontos() throws Exception {
		fail("Not yet implemented");
		Sprint sprintTest = new Sprint();
		BurndownBO burn = new BurndownBO();
		sprintTest.setQtdeDias(3);
		
		List<Estoria> estorias = new ArrayList<Estoria>();
		
		Estoria est1 = new Estoria();
		est1.setTempoEstimado(40);
		est1.setCodEstoria(1);
		est1.setQtdePontos(5);

		Estoria est2 = new Estoria();
		est2.setTempoEstimado(32);
		est2.setCodEstoria(2);
		est2.setQtdePontos(3);
		
		estorias.add(est1);
		estorias.add(est2);
		sprintTest.setEstorias(estorias);
		
		List<ItemHistorico> itens = new ArrayList<ItemHistorico>();
		ItemHistorico item = new ItemHistorico();
		item.setCodEstoria(1);
		item.setTempoGasto(34);
		item.setData(DataUtil.converteStringParaDate(DT_INICIO_SPRINT));

		ItemHistorico item2 = new ItemHistorico();
		item2.setCodEstoria(2);
		item2.setTempoGasto(18);
		item2.setData(DataUtil.converteStringParaDate("09/09/2014"));
		
			
		itens.add(item);
		itens.add(item2);
		sprintTest.setItensHistorico(itens);
		
		Map<Date,Integer> Esperado = new LinkedHashMap<Date,Integer>();
		Esperado.put(DataUtil.converteStringParaDate("08/09/2014"),5);
		Esperado.put(DataUtil.converteStringParaDate("09/09/2014"), 3);
		
		
		Map<Date,Integer> calculado = burn.eixoXYPontos(sprintTest);
		assertEquals(Esperado, calculado);
	}
}
