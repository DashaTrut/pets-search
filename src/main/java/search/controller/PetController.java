package search.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import search.dto.NewPet;
import search.service.PetService;

import javax.validation.Valid;

@Slf4j
@Validated
@RestController
@RequestMapping(path = "/pets")
@RequiredArgsConstructor
public class PetController {
    private final PetService petService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public NewPet petCreate(@RequestBody @Valid NewPet newPet) {
        log.info("Creating compilation admin{}", newPet);
        return petService.petCreateUser(newCompilationDto);
    }

    @PatchMapping("/{compId}")
    public CompilationDto compilationUpdate(@RequestBody @Valid PetUpdate newCompilationDto, @PathVariable Integer compId) {
        log.info("Update compilation admin{}", newCompilationDto);
        return petService.petUpdateUser(newCompilationDto, compId);
    }

    @DeleteMapping("/{compId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable Integer compId) {
        log.info("Delete compilation {}", compId);
        petService.petDeleteUser(compId);
    }
}
