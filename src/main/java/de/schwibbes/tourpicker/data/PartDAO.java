package de.schwibbes.tourpicker.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("part")
public interface PartDAO extends CrudRepository<Part, Long> {

	@Override
	List<Part> findAll();
}
