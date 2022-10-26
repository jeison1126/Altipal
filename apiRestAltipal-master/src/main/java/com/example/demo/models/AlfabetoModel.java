package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "alfabeto")
public class AlfabetoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private Integer campo1;
    private String campo2;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getCampo1() {
		return campo1;
	}
	public void setCampo1(Integer campo1) {
		this.campo1 = campo1;
	}
	public String getCampo2() {
		return campo2;
	}
	public void setCampo2(String campo2) {
		this.campo2 = campo2;
	}
    
}