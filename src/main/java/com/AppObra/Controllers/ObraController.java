package com.AppObra.Controllers;

import com.AppObra.models.Obra;
import com.AppObra.repositorio.ObraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ObraController {

    @Autowired
    private ObraRepository er;

    @RequestMapping(value = "/CadastrarObra", method = RequestMethod.GET)
    public String form() {
        return "CadastroObra";
    }

    @RequestMapping(value = "/CadastrarObra", method = RequestMethod.POST)
    public String form(Obra obra){

        er.save(obra);

        return "redirect:/CadastrarObra";
    }

    @RequestMapping("/ListaObra")
    public ModelAndView listaObra(){
        ModelAndView mv = new ModelAndView("/ListaObra");
        Iterable<Obra> obras = er.findAll();

        mv.addObject("Obra", obras);

        return mv;
    }

    @RequestMapping("/ListaObra/{Codigo}")
    public String excluir(@PathVariable("Codigo") String codigo) {
        er.deleteById(codigo);
        return "redirect:/ListaObra";

    }
}
