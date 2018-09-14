package info.natehuff.demo.controller;

import info.natehuff.demo.dto.Pick;
import info.natehuff.demo.repository.PickRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class PickController {
    private PickRepository repository;

    public PickController(PickRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/picks")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Pick> goodGames() {

        return repository.findAll().stream()
                .filter(this::isGreat)
                .collect(Collectors.toList());
    }

    private boolean isGreat(Pick pick) {
        return !pick.getName().equals("Budweiser") &&
                !pick.getName().equals("Coors Light") &&
                !pick.getName().equals("PBR");
    }
}