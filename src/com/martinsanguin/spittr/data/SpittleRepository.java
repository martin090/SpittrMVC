package com.martinsanguin.spittr.data;
import java.util.List;
import com.martinsanguin.spittr.be.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);
}
