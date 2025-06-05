package br.com.pedromayer.portal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedromayer.portal.model.Usuario;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioController extends GenericController<Usuario, Integer>{

}
