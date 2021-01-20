package de.demo.android_project.model;

import java.sql.Time;
import java.util.Date;

public class Interventions {
    private String id;
    private  String titre,commentaires;
    private String datedebut , datefin,dateplanification,datevalidation,dateterminaison;
    private String heuredebutplan,heurefinplan,heuredebuteffect,heurefineffect;

    public Interventions(String id, String titre, String commentaires, String datedebut, String datefin, String dateplanification, String datevalidation, String dateterminaison, String heuredebutplan, String heurefinplan, String heuredebuteffect, String heurefineffect) {
        this.id = id;
        this.titre = titre;
        this.commentaires = commentaires;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.dateplanification = dateplanification;
        this.datevalidation = datevalidation;
        this.dateterminaison = dateterminaison;
        this.heuredebutplan = heuredebutplan;
        this.heurefinplan = heurefinplan;
        this.heuredebuteffect = heuredebuteffect;
        this.heurefineffect = heurefineffect;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public String getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(String datedebut) {
        this.datedebut = datedebut;
    }

    public String getDatefin() {
        return datefin;
    }

    public void setDatefin(String datefin) {
        this.datefin = datefin;
    }

    public String getDateplanification() {
        return dateplanification;
    }

    public void setDateplanification(String dateplanification) {
        this.dateplanification = dateplanification;
    }

    public String getDatevalidation() {
        return datevalidation;
    }

    public void setDatevalidation(String datevalidation) {
        this.datevalidation = datevalidation;
    }

    public String getDateterminaison() {
        return dateterminaison;
    }

    public void setDateterminaison(String dateterminaison) {
        this.dateterminaison = dateterminaison;
    }

    public String getHeuredebutplan() {
        return heuredebutplan;
    }

    public void setHeuredebutplan(String heuredebutplan) {
        this.heuredebutplan = heuredebutplan;
    }

    public String getHeurefinplan() {
        return heurefinplan;
    }

    public void setHeurefinplan(String heurefinplan) {
        this.heurefinplan = heurefinplan;
    }

    public String getHeuredebuteffect() {
        return heuredebuteffect;
    }

    public void setHeuredebuteffect(String heuredebuteffect) {
        this.heuredebuteffect = heuredebuteffect;
    }

    public String getHeurefineffect() {
        return heurefineffect;
    }

    public void setHeurefineffect(String heurefineffect) {
        this.heurefineffect = heurefineffect;
    }
}
