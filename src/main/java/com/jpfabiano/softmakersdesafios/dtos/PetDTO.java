package com.jpfabiano.softmakersdesafios.dtos;

import com.jpfabiano.softmakersdesafios.models.DonoModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


public record PetDTO(@NotNull String nome , @NotNull String raca ,
                     @Pattern(regexp = "^(Cachorro|Gato)$") String especie , @NotNull int idade, @NotNull DonoModel dono) {

}
