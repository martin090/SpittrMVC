package com.martinsanguin.spittr.data;

import com.martinsanguin.spittr.be.Spitter;

public interface SpitterRepository {
	Spitter findByUsername(String username);
	void save(Spitter spitter);
}
