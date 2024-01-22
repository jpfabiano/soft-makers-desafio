package com.jpfabiano.softmakersdesafios.controller;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.jpfabiano.softmakersdesafios.dtos.DonoDTO;
import com.jpfabiano.softmakersdesafios.dtos.DonoUpdateDTO;
import com.jpfabiano.softmakersdesafios.dtos.PetDTO;
import com.jpfabiano.softmakersdesafios.dtos.PetUpdateDTO;
import com.jpfabiano.softmakersdesafios.models.DonoModel;
import com.jpfabiano.softmakersdesafios.models.PetModel;
import com.jpfabiano.softmakersdesafios.repository.DonoRepository;
import com.jpfabiano.softmakersdesafios.repository.PetRepository;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.beans.Beans;
import java.util.List;
import java.util.Optional;

@RestController
public class PetShopController {
    @Autowired
    DonoRepository donorepository;
    @Autowired
    PetRepository petrepository;

    @PostMapping ("/api_petshop/dono")
    public ResponseEntity<Object> cadastrasDono (@RequestBody @Validated DonoDTO donoDto){
        DonoModel donoModel = new DonoModel();
        BeanUtils.copyProperties(donoDto,donoModel);
        return ResponseEntity.status(HttpStatus.OK).body(donorepository.save(donoModel));
    }
    @PostMapping("/api_petshop/pet")
    public ResponseEntity<Object> cadastrarPet (@RequestBody @Validated PetDTO petDto){
        PetModel petModel = new PetModel();
        BeanUtils.copyProperties(petDto,petModel);
        return ResponseEntity.status(HttpStatus.OK).body(petrepository.save(petModel));
    }
    @GetMapping ("/api_petshop/pet")
    public ResponseEntity<List<PetModel>> mostrarPets(){
        return ResponseEntity.status(HttpStatus.OK).body(petrepository.findAll());
    }
    @GetMapping("/api_petshop/pet/{id}")
    ResponseEntity<Object> buscarPet (@PathVariable (name = "id") Long id){
        Optional<PetModel> pet = petrepository.findById(id);
        if (pet.isEmpty()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O pet com esse id não foi encontrado");
        return ResponseEntity.status(HttpStatus.OK).body(pet);
    }
    @PutMapping ("/api_petshop/dono/{id}")
    public ResponseEntity<Object> atualizarDono (@PathVariable (name = "id") Long id , @RequestBody DonoUpdateDTO donoUpdateDto){
        Optional<DonoModel> dono = donorepository.findById(id);
        if (dono.isEmpty()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O dono com esse id não foi encontrado");
        DonoModel donoModel = dono.get();
        if (donoUpdateDto.nome() != null){
            donoModel.setNome(donoUpdateDto.nome());
        }
        if (donoUpdateDto.idade() != null){
            donoModel.setIdade(donoUpdateDto.idade());
        }
        if (donoUpdateDto.phone() != null){
            donoModel.setPhone(donoUpdateDto.phone());
        }
        if (donoUpdateDto.bairro() != null){
            donoModel.setBairro(donoUpdateDto.bairro());
        }
        if (donoUpdateDto.rua() != null){
            donoModel.setRua(donoUpdateDto.rua());
        }
        if (donoUpdateDto.numero() != null){
            donoModel.setNumero(donoUpdateDto.numero());
        }
        return ResponseEntity.status(HttpStatus.OK).body(donorepository.save(donoModel));
    }
    @PutMapping ("/api_petshop/pet/{id}")
    public ResponseEntity<Object> atualizarPet (@PathVariable (name = "id") Long id, @RequestBody @Validated PetUpdateDTO petUpdateDto){
        Optional<PetModel> pet = petrepository.findById(id);
        if (pet.isEmpty()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O pet com esse id não foi encontrado");
        PetModel petModel = pet.get();
        if (petUpdateDto.nome() != null){
            petModel.setNome(petUpdateDto.nome());
        }
        if (petUpdateDto.idade() != null){
            petModel.setIdade(petUpdateDto.idade());
        }
        if (petUpdateDto.especie() != null){
            petModel.setEspecie(petUpdateDto.especie());
        }
        if (petUpdateDto.raca() != null){
            petModel.setRaca(petUpdateDto.raca());
        }
        return ResponseEntity.status(HttpStatus.OK).body(petrepository.save(petModel));
    }
    @DeleteMapping ("/api_petshop/dono/{id}")
    ResponseEntity<Object> deletarDono (@PathVariable(name = "id") Long id){
        Optional<DonoModel> dono = donorepository.findById(id);
        if (dono.isEmpty()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O dono com esse id não foi encontrado");
        donorepository.delete(dono.get());
        return ResponseEntity.status(HttpStatus.OK).body(dono);
    }
    @DeleteMapping("/api_petshop/pet/{id}")
    ResponseEntity<Object> deletarPet (@PathVariable (name = "id") Long id){
        Optional<PetModel> pet = petrepository.findById(id);
        if (pet.isEmpty()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O pet com esse id não foi encontrado");
        petrepository.delete(pet.get());
        return ResponseEntity.status(HttpStatus.OK).body(pet);
    }

}
