package com.uca.capas.modelo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.modelo.domain.Producto;

@Controller
public class Clase11Controller {
	
	@RequestMapping("/index11")
	public ModelAndView index11() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("Producto", new Producto());
		mav.setViewName("clases/clase11/index");
		return mav;
	}
	
	@RequestMapping("/procesar")
	public ModelAndView procesar(@ModelAttribute Producto user) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("codigo", user.getCodigo());
		mav.addObject("nombre", user.getNombre());
		mav.addObject("marca", user.getMarca());
		mav.addObject("descripcion", user.getDescripcion());
		mav.addObject("cantidad", user.getCantidad());
		mav.addObject("fecha", user.getFecha());
		mav.setViewName("clases/clase11/resultado");
		return mav;
	}
	
	@RequestMapping("/procesar2")
	public ModelAndView procesar2(@Valid @ModelAttribute Producto user, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) { //Hay errores, redirigimos a la pantalla del formulario
			mav.setViewName("clases/clase11/index");
		}
		else { //Si no hay, flujo normal
			mav.addObject("codigo", user.getCodigo());
			mav.addObject("nombre", user.getNombre());
			mav.addObject("marca", user.getMarca());
			mav.addObject("descripcion", user.getDescripcion());
			mav.addObject("cantidad", user.getCantidad());
			mav.addObject("fecha", user.getFecha());
			mav.setViewName("clases/clase11/resultado");
		}
		return mav;
	}

}
