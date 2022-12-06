package com.example.divisoresDeNumero.controller;

import lombok.Data;

import java.util.List;

@Data

public class ResultadoCalculos {
    private Integer numeroInicial;
    private List<Integer> pares;
    private List<Integer> divisores;
}
