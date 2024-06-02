package com.ucentral.CampeonatoProy.controller;

import com.ucentral.CampeonatoProy.entity.Equipos;
import com.ucentral.CampeonatoProy.service.EquiposService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping("/api/equipos")
@RestController

public class EquiposController {

    private final EquiposService equiposService;

    @GetMapping
    public Iterable<Equipos> list() {
        return equiposService.findAll();
    }

    @GetMapping("{id}")
    public Equipos get(@PathVariable Integer id) {
        return equiposService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Equipos create(@RequestBody Equipos equipos) {
        return equiposService.create(equipos);
    }

    @PutMapping ("{id}")
    public Equipos update(@PathVariable Integer id,
                          @RequestBody Equipos form) {
        return equiposService.update(id, form);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        equiposService.delete(id);
    }

}
