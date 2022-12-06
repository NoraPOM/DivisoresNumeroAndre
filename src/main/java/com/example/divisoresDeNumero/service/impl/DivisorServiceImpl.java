package com.example.divisoresDeNumero.service.impl;

import com.example.divisoresDeNumero.controller.ResultadoCalculos;
import com.example.divisoresDeNumero.service.DivisorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DivisorServiceImpl implements DivisorService {
    @Override
       public ResultadoCalculos generarDivisores(Integer numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException();
        }
        ResultadoCalculos resultadoCalculos = new ResultadoCalculos();
        resultadoCalculos.setNumeroInicial(numero);
        resultadoCalculos.setPares(devolverPares(numero));
        resultadoCalculos.setDivisores(devolverDivisores(numero));
        return resultadoCalculos;
    }

        //Esta primera parte devuelve los divisores de un número
        public List<Integer> devolverDivisores (int num){
            List<Integer> listaDevolverDivisores = new ArrayList<>(); // Esta lista es para los divisores
            int divisor = 1;
            while (divisor <= num) {
                if (num % divisor == 0) {
                    listaDevolverDivisores.add(divisor);
                }
                divisor = divisor + 1;
            }
            return listaDevolverDivisores;
        }

        public List<Integer> devolverPares (int num) {
            List < Integer > listaDevolverPares = new ArrayList<>(); // Esta lista es para los pares
            //Esta segunda  parte devuelve los número pares hasta llegar al número enviado
            int temporal = 1;
            int divisor1;
            for (int i = 1; i < num; i++) {
                divisor1 = temporal % 2;
                if (divisor1 == 0) {
                    listaDevolverPares.add(temporal);
                }
                temporal = temporal + 1;
            }
            return listaDevolverPares;
        }

    }

