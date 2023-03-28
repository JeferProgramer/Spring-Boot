package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	
	@Value("${texto.indexcontroller.pefil.titulo}")
	private String textoPefil;
	
	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;

	@GetMapping({"/index", "/", "/home"})
	public String index(Model model) {
		model.addAttribute("titulo", textoIndex);
		return "index";
	}
	
	@GetMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setApellido("Andres");
		usuario.setNombre("Andres");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", textoPefil.concat(usuario.getNombre()));
		return "pefil";
	}
	
	@GetMapping("/listar")
	public String listar (Model model) {
		model.addAttribute("titulo", textoListar);
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(new Usuario("Andres", "Gomez", "ande@gamil.com"),
				new Usuario("Carlos", "perez", "calo@gamil.com"),
				new Usuario("Aleja", "Bravo", "aleb@gamil.com"),
				new Usuario("Jefer", "Canon", "jefeca@gamil.com"));
		return usuarios;
	}
}
