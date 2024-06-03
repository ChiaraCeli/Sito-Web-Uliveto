package com.paoloceli.Azienda.Agricola.Uliveti.olio;

import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name="prodotti")
public class Prodotto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String nome;
	private String oliva;
	private String intensita;
	private double prezzo;
	
	@Column(columnDefinition = "TEXT")
	private String descrizione;
	private Date prodottoIl;
	private String nomeImmagine;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getOliva() {
		return oliva;
	}
	public void setOliva(String oliva) {
		this.oliva = oliva;
	}
	public String getIntensita() {
		return intensita;
	}
	public void setIntensita(String intensita) {
		this.intensita = intensita;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Date getProdottoIl() {
		return prodottoIl;
	}
	public void setProdottoIl(Date prodottoIl) {
		this.prodottoIl = prodottoIl;
	}
	public String getNomeImmagine() {
		return nomeImmagine;
	}
	public void setNomeImmagine(String nomeImmagine) {
		this.nomeImmagine = nomeImmagine;
	}
	
}
