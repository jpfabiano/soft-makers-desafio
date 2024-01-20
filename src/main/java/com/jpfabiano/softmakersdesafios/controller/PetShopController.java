package com.jpfabiano.softmakersdesafios.controller;

import com.jpfabiano.softmakersdesafios.dtos.DonoDTO;
import com.jpfabiano.softmakersdesafios.dtos.PetDTO;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}
