package com.uabc.edu.mx.p2curriculumvitae.curriculum_vitae.Modelo;

import lombok.Data;

import java.util.ArrayList;

@Data
public class CurriculumV {

    private  String nombre;
    private  String apellidoP;
    private  String apellidoM;
    private  String fechaNac;
    private  String nacionalidad;
    private  String telefono;
    private  String email;
    private  String foto;

    private ArrayList<Estudios> estudios;
    private ArrayList<Empleos> empleos;
    private ArrayList<Idioma> idiomas;
    private ArrayList<Conocimientos> conocimientos;
}
