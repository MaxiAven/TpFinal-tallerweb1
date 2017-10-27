package ar.edu.unlam.tallerweb1.controladores;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import ar.edu.unlam.tallerweb1.modelo.Ruta;
import ar.edu.unlam.tallerweb1.servicios.ServicioRuta;

@Controller
public class ControladorIndex {
	
	@Inject
	private ServicioRuta servicioRuta;
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public ModelAndView inicio(){
		
		return new ModelAndView("index");
	}
	
	@RequestMapping(path="/cargarRuta", method=RequestMethod.GET)
	public ModelAndView cargaRuta(){
		ModelMap modelo = new ModelMap();
		Ruta ruta = new Ruta();
		modelo.put("rutita",ruta);
		return new ModelAndView("cargaRuta", modelo);
	}
	
	@RequestMapping(path = "/cargar-ruta", method = RequestMethod.POST)
	public ModelAndView cargarRuta(@ModelAttribute("ruta") Ruta ruta, HttpServletRequest request) {
		
			servicioRuta.agregarRuta(ruta);
		
		
		return new ModelAndView("registroCargadoOk");
	}
	
	
}
