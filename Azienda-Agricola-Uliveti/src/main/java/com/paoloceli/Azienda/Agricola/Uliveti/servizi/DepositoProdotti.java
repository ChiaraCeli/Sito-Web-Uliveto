package com.paoloceli.Azienda.Agricola.Uliveti.servizi;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paoloceli.Azienda.Agricola.Uliveti.olio.Prodotto;

public interface DepositoProdotti extends JpaRepository<Prodotto, Integer> {

}
