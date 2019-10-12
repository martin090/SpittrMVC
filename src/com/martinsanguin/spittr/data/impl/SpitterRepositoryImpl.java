package com.martinsanguin.spittr.data.impl;

import org.springframework.stereotype.Repository;

import com.martinsanguin.spittr.be.Spitter;
import com.martinsanguin.spittr.data.SpitterRepository;

@Repository
public class SpitterRepositoryImpl implements SpitterRepository {

	@Override
	public void save(Spitter spitter) {
		System.out.println(spitter.toString());
	}

	@Override
	public Spitter findByUsername(String username) {
		return new Spitter("Martin", "Sanguin", username, "123");
	}
	
}
