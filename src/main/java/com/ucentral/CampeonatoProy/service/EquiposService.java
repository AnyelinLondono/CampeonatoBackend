package com.ucentral.CampeonatoProy.service;

import com.ucentral.CampeonatoProy.entity.Equipos;
import com.ucentral.CampeonatoProy.repository.EquiposRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@Service
public class EquiposService {

    private final EquiposRepository equiposRepository;

    public Iterable<Equipos> findAll() {
        return equiposRepository.findAll();
    }

    public Equipos findById(Integer id) {
        return equiposRepository
                .findById(id)
                .orElse(null);
    }

    public Equipos create(Equipos equipos) {
        return equiposRepository.save(equipos);
    }

    public Equipos update(Integer id, Equipos form) {
        Equipos equiposFromDb = findById(id);

        equiposFromDb.setNombre(form.getNombre());

        return equiposRepository.save(equiposFromDb);
    }

    public void delete(Integer id) {
        Equipos equiposFromDb = findById(id);
        equiposRepository.delete(equiposFromDb);
    }
}
