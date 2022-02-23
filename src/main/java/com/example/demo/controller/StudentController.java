package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{

    private final StudentService studentService;
    //estoy pasando una interface, solo hago referencia y no declaro un objeto
                              // no pongo new porque solo hago referencia al objeto que creo espring
    
    public StudentController( @Autowired StudentService studentService )
    {                         //@Autowired decirle que inyecte el objeto
    	                      //la interface la estoy inyectando en el constructor
        this.studentService = studentService;
    }
    //pero como creara un objeto este constructor si las interfaces no pueden crearlos?
    //necesitamos pasarle un objeto que implemente esa interface, eso lo hacemos con la clase que creamos:
    //StudentServiceImp, con ella creamos los objetos que usas los metodos de la interface

    @GetMapping("/student/{id}")
    Student findById( @PathVariable("id") String id )
    {
    	Student student1 = new Student("1",1, "Javier", "Santiago", 8);
    	Student student2 = new Student("2",3, "Raul", "Sanchez", 3);
    	Student student3 = new Student("3",34, "Rodrigo", "Leyva", 4);
    	studentService.add(student1);
    	studentService.add(student2);
    	studentService.add(student3);

        return studentService.findById( id );
    }

    //correr servidor correcto: click derecho en proyecto, ass/ spring boot App
}
