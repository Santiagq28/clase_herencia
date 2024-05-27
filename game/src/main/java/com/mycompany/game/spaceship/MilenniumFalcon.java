
package com.mycompany.game.spaceship;

public class MilenniumFalcon extends NuclearShip{
    private boolean hyperSpeed;
    private int cannons;
    private boolean shield;

    public MilenniumFalcon(boolean hyperSpeed, int cannons, boolean shield, String name, boolean armed, int crew, int damage, int health, int speed) {
        super(name, armed, crew, damage, health, speed);
        this.hyperSpeed = hyperSpeed;
        this.cannons = cannons;
        this.shield = shield;
    }
    
    
    @Override
    public void shoot(){
        System.out.println("Disparo a cañonazos!!!");
    }
    @Override
    public void fly(){
        
    }
    public void toggleShield(){
        this.shield = !this.shield;
    }
}
