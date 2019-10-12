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
		Spittle s3 = null;
		List<Spittle> lista = new ArrayList<Spittle>();
		if(max==99) {
			s3 = new Spittle("Prueba 0", new Date("2019/03/12"), 200.00, 250.00);
			lista.add(s3);
		}
		Spittle s1 = new Spittle("Prueba 1", new Date("2019/03/13"), 100.00, 100.00);
		Spittle s2 = new Spittle("Prueba 2", new Date("2019/03/13"), 100.00, 100.00);
		lista.add(s1);
		lista.add(s2);
		
		return lista;
	}

	@Override
	public Spittle findOne(long id) {
		return new Spittle("Prueba findOne",new Date("2019/03/13"),100.00,50.00);
	}

}
