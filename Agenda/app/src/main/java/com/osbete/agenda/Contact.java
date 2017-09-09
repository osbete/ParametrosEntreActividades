package com.osbete.agenda;

import java.io.Serializable;
public class Contact implements Serializable {
    private String usuario;
    private String email;
    private String twitter;
    private String tel;
    private String fechanac;

    public Contact(String usuario, String email, String twitter, String tel, String fechanac) {
        this.usuario = usuario;
        this.email = email;
        this.twitter = twitter;
        this.tel = tel;
        this.fechanac = fechanac;
    }

    @Override
    public String toString() {
        return usuario +"\n"+email;
    }
}
