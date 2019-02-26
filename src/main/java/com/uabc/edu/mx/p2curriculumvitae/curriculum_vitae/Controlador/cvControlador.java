package com.uabc.edu.mx.p2curriculumvitae.curriculum_vitae.Controlador;

import com.uabc.edu.mx.p2curriculumvitae.curriculum_vitae.Modelo.CurriculumV;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Controller()
@RequestMapping("/CurriculumVitae")
public class cvControlador {

    @GetMapping(value = "/datos")
    public String index(Model model){
        //Instancia de la Clase CurriculumV
        CurriculumV cuv = new CurriculumV();
        //Se crea un ArrayList que nos permitira llenar nuestros ArrayList de la clase CurriculumV
        ArrayList datos = new ArrayList();

        //Se le asignan los valores a los datos de la persona
        cuv.setNombre("Luis Adan");
        cuv.setApellidoP("Salazar");
        cuv.setApellidoM("Uribe");
        cuv.setFechaNac("22/09/1997");
        cuv.setNacionalidad("Mexicano");
        cuv.setTelefono("686-406-7506");
        cuv.setEmail("adan.salazar@uabc.edu.mx");
        cuv.setFoto("/imagen/foto.jpg");

        //ArrayList para asignarle los datos a Estudios
        datos = new ArrayList();
        datos.add("Universidad Autonoma de Baja California");
        datos.add("Mexicali B.C.");
        datos.add("2016-Presente");
        //
        datos.add("Cobach Miguel Hidalgo y Costilla");
        datos.add("Mexicali B.C.");
        datos.add("2013-2016");
        //
        datos.add("Escuela Secundaria Tecnica #18");
        datos.add("Mexicali B.C.");
        datos.add("2010-2013");
        //
        datos.add("Escuela Primaria Centenario de Mexicali");
        datos.add("Mexicali B.C.");
        datos.add("2004-2010");
        cuv.setEstudios(datos);

        //ArrayList para asignarle los datos a Empleos
        datos = new ArrayList();
        datos.add("Circle K");
        datos.add("Calz Anáhuac #422");
        datos.add("Mexicali B.C.");
        datos.add("555 261 9800");
        datos.add("2018-2018");
        //
        datos.add("VIP Market");
        datos.add("Calz Anáhuac #899");
        datos.add("Mexicali B.C.");
        datos.add("653 517 2100");
        datos.add("2017-2017");
        //
        datos.add("Newell Rubbermaid");
        datos.add("Clzd. Héctor Terán Terán #2898");
        datos.add("Mexicali B.C.");
        datos.add("686 843 5100");
        datos.add("2016-2017");
        cuv.setEmpleos(datos);

        //ArrayList para asignarle los datos a Estudios
        datos = new ArrayList();
        datos.add("Español");
        datos.add("Ingles");
        datos.add("Italiano");
        cuv.setIdiomas(datos);

        //ArrayList para asignarle los datos a Conocimientos
        datos = new ArrayList();
        datos.add("Programacion Orientada a Objetos");
        datos.add("Microsoft Office");
        datos.add("HTML/CSS");
        datos.add("Bases de datos SQL");
        datos.add("Dominar la Fuerza");
        cuv.setConocimientos(datos);

        model.addAttribute("cv",cuv);
        return "Curriculumv";
    }
}
