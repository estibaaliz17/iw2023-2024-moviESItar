package com.example.crudrapido.views;

import com.example.crudrapido.entity.User;
import com.vaadin.flow.component.crud.BinderCrudEditor;
import com.vaadin.flow.component.crud.Crud;
import com.vaadin.flow.component.crud.CrudEditor;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;
import com.example.crudrapido.service.UserService;
import com.vaadin.flow.data.provider.ListDataProvider;
import java.util.ArrayList;
import com.vaadin.flow.component.datepicker.DatePicker;



import java.util.Arrays;
import java.util.List;

@Route("prueba")
public class userGrid extends Div {

    private Crud<User> crud;
    private UserService userService;

    //las comillas deben de ser igual que los atributos de mi clase user, igual que la bd
    private String NAME = "name";
    private String DESCRIPTION = "description";
    private String BIRTHDAY = "birth_date";

    public userGrid(UserService userService) {
        this.userService = userService;
        Grid<User> grid = new Grid<>(User.class, false);

        grid.setColumns(NAME, DESCRIPTION, BIRTHDAY);

        grid.addColumn(User::getName).setHeader("Name");
        grid.addColumn(User::getDescription).setHeader("Description");
        grid.addColumn(User::getBirth_date).setHeader("Birth_date");


        // Cargar los datos de la base de datos al inicializar la vista
        List<User> usuarios = userService.findAll();
        grid.setItems(usuarios);

        add(grid);
    }




}

