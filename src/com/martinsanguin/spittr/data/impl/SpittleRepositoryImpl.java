package com.martinsanguin.spittr.data.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.martinsanguin.spittr.be.Spittle;
import com.martinsanguin.spittr.data.SpittleRepository;

@Repository
public class SpittleRepositoryImpl implements SpittleRepository {

	@Override
	public List<Spittle> findSpittles(long max, int count) {
		Spittle s1 = new Spittle("Prueba 1", new Date("2019/03/13"), 100.00, 100.00);
		Spittle s2 = new Spittle("Prueba 2", new Date("2019/03/13"), 100.00, 100.00);
		List<Spittle> lista = new ArrayList<Spittle>();
		lista.add(s1);
		lista.add(s2);
		return lista;
	}

}
