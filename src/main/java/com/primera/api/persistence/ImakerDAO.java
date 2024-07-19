package com.primera.api.persistence;

import com.primera.api.entities.Maker;
import java.util.List;
import java.util.Optional;

public interface ImakerDAO {


    List<Maker> findAll();

    Optional<Maker> findById(Long id);

    void save(Maker maker);

    void deleteById(Long id);

}
