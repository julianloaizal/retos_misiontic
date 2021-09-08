/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *  ---> Este es el mensaje de prueba Git push <---
 */
package Variante1;

/**
 *
 * @author Pruebas W10
 */
public class Enemigo extends Personaje {
    
    private int evolucionesAplicadas = 0;
    private int resistencia = 1;
    
    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }
    
    @Override
    public void recibirImpacto(double d){
        if(this.getVida() - d < 0)
            this.setVida(0);
        else
            this.setVida(this.getVida() - d / this.resistencia);
    }
    
    public void evolucionar(){
        if(this.getVida() <= 30 && this.evolucionesAplicadas == 0){
            this.setDamage(this.getDamage() + 20);
            this.evolucionesAplicadas ++;
        }
        if(this.getVida() <= 10 && this.evolucionesAplicadas == 1){
            resistencia ++;
            this.evolucionesAplicadas ++;
        }
    }

    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }

    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
    
}
