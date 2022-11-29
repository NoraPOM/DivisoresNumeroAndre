package com.example.divisoresDeNumero.service.impl;

import com.example.divisoresDeNumero.service.DivisorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DivisorServiceImpl implements DivisorService {
    @Override
       public List<List<Integer>> generarDivisores(Integer numero) {
        List<List<Integer>> listaGeneral = new ArrayList<>();

        List<Integer> listaDevolverDivisores = new ArrayList<>(); // Esta lista es para los divisores
        //Esta primera parte devuelve los divisores de un número
        int divisor = 2;
        while (divisor<=numero){
            if(numero%divisor ==0){
                listaDevolverDivisores.add(divisor);
            }
            divisor = divisor +1;
        }
        List<Integer> listaDevolverPares = new ArrayList<>(); // Esta lista es para los pares
        //Esta segunda  parte devuelve los número pares hasta llegar al número enviado
        int temporal = numero;
        int divisor1 = 0;
        for (int i=1; i<numero;i++){
            divisor1 = temporal%2;
            if( divisor1==0){
                listaDevolverPares.add(temporal);
            }
            temporal=temporal-1;
        }
        listaGeneral.add(listaDevolverPares);
        listaGeneral.add(listaDevolverDivisores);
        return listaGeneral;
    }
}
