/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variante1;

/**
 *
 * @author Pruebas W10
 */
public class Jugador extends Personaje{
    
    private int numeroBotiquines = 0;

    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }   
    
    public void usarBotiquin(){
        if(this.getNumeroBotiquines() > 0){
            if(this.getVida() + 5 > 100){
                this.setNumeroBotiquines(this.getNumeroBotiquines() - 1);
                this.setVida(100);
            }
            else{
                this.setNumeroBotiquines(this.getNumeroBotiquines() - 1);
                this.setVida(this.getVida() + 5);
            }
        }
    }
        
    public void recogerBotiquin(){
        this.setNumeroBotiquines(this.getNumeroBotiquines() + 1);
    }
    
    
    public void golpear(Enemigo p){
        p.recibirImpacto(this.getDamage() / this.calcularDistanciaRespectoPersonaje(p));
        p.evolucionar();
        
    }
    
    public void moverDerecha(double d){
        this.setPosicionX(this.getPosicionX() + d);
    }
    
    public void moverIzquierda(double d){
        this.setPosicionX(this.getPosicionX() - d);
    }
    
    public void moverArriba(double d){
        this.setPosicionY(this.getPosicionY() + d);
    }
    
    public void moverAbajo(double d){
        this.setPosicionY(this.getPosicionY() - d);
    }

     
    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

    

    
}
