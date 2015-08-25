/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author takedown
 */
public class Calendarios {

    public String dia;
    public String diaSemana;
    public String mes;
    public String ano;
    public String hora;

    public void leData() {
        Date data = new Date();
        dia = "" + data.getDate();
        //mes = "" + data.getMonth();
        ano = "" + (1900 + data.getYear());
       // diaSemana = "" + data.getDay();
        switch (data.getDay()){
            case 0: diaSemana = "Domingo";break;
            case 1: diaSemana = "Segunda";break;
            case 2: diaSemana = "Terça";break;
            case 3: diaSemana = "Quarta";break;
            case 4: diaSemana = "Quinta";break;
            case 5: diaSemana = "Sexta";break;
            case 6: diaSemana = "Sábado";break;
        }
        switch (data.getMonth()) {
            case 0: mes = "Janeiro"; break;
            case 1: mes = "Fevereiro"; break;
            case 2: mes = "Março"; break;
            case 3: mes = "Abril"; break;
            case 4: mes = "Maio"; break;
            case 5: mes = "Junho"; break;
            case 6: mes = "Julho"; break;
            case 7: mes = "Agosto"; break;
            case 8: mes = "Setembro"; break;
            case 9: mes = "Outobro"; break;
            case 10: mes = "Novembro"; break;
            case 11: mes = "Dezembro"; break;
        }
    }
    SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");

    public void leHora() {
        Date horaAtual = new Date();
        hora = horaFormatada.format(horaAtual);
    }

}
