package com.paoloceli.Azienda.Agricola.Uliveti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paoloceli.Azienda.Agricola.Uliveti.olio.Prodotto;
import com.paoloceli.Azienda.Agricola.Uliveti.servizi.DepositoProdotti;

@Controller
@RequestMapping("/prodotti")
public class ControllerProdotti {

	
	@Autowired
	private DepositoProdotti depo;
	
	@GetMapping({"", "/"})
	public String mostraListaProdotti (Model model) {
		List<Prodotto> prodotti = depo.findAll();
		model.addAttribute("prodotti", prodotti);
		return "prodotti/index";
	}
}
