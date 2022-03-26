package com.tdea.parcial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UtilsTests {

    @Test
    public void IsAfternoon() {
        int hora = 12;
        String resul = Utils.getTimeOfDay(hora);
        assertEquals("Afternoon",resul);
    }
    @Test
    public void IsInvalidHour(){
        int hora = 26;
        String resul = Utils.getTimeOfDay(hora);
        assertEquals("Invalid hour",resul);
    }

    @Test
    public void isNight(){
        int hora = 3;
        String resul = Utils.getTimeOfDay(hora);
        assertEquals("Night",resul);
    }

    @Test
    public void isMorning(){
        int hora = 8;
        String resul = Utils.getTimeOfDay(hora);
        assertEquals("Morning",resul);
    }

    @Test
    public void isEvening(){
        int hora = 19;
        String resul = Utils.getTimeOfDay(hora);
        assertEquals("Evening",resul);
    }



























}
