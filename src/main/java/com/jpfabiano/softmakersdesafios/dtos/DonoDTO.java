package com.jpfabiano.softmakersdesafios.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DonoDTO(@NotNull String nome, @NotNull String rua, @NotNull String bairro,
                      @NotNull int phone ,@NotNull int idade ,@NotNull int numero ) {
}
