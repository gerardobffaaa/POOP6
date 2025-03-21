/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author Orozco Mora Gerardo
 */
public class Pokemon {
    
    private String nombre;
    private int Ataque;
    private int Defensa;
    private int ataqueEsp;
    private int defensaEsp;
    private int vida;
    private int velocidad;
    private int dificultad;

/**
 *
 * Consturctor vacio, inicializa los atributos en cero.
 */
    public Pokemon() {
    }
/**
 *
 * Constructor lleno inicializa todos los atributos dependiedo que se ingrese en los parametros.
 */
    public Pokemon(String nombre,int Ataque, int Defensa, int ataqueEsp, int defensaEsp, int vida, int velocidad, int dificultad) {
        this.nombre= nombre;
        this.Ataque = Ataque;
        this.Defensa = Defensa;
        this.ataqueEsp = ataqueEsp;
        this.defensaEsp = defensaEsp;
        this.vida = vida;
        this.velocidad = velocidad;
        this.dificultad = dificultad;
    }
/**
 *
 * setter para el nombre del pokemon, recibe un String.
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 *
 * setter para el ataque del pokemon, recibe un entero.
 */
    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }
/**
 *
 * setter para la defensa del pokemon, recibe un entero.
 */
    public void setDefensa(int Defensa) {
        this.Defensa = Defensa;
    }
/**
 *
 * setter para el ataque especial del pokemon, recibe un entero.
 */
    public void setAtaqueEsp(int ataqueEsp) {
        this.ataqueEsp = ataqueEsp;
    }
/**
 *
 * setter para la defensa especial del pokemon, recibe un entero.
 */
    public void setDefensaEsp(int defensaEsp) {
        this.defensaEsp = defensaEsp;
    }
 /**
 *
 * setter para la vida  del pokemon, recibe un entero.
 */
    public void setVida(int vida) {
        this.vida = vida;
    }
/**
 *
 * setter para ela velocidad del pokemon, recibe un entero.
 */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
/**
 *
 * setter para que tan dificil es de atrapar el pokemon, recibe un entero. 
 * Si la dificltad se introduce como negativa, se utiliza el valor absoluto
 * del entero recivido yla difucultad debe estar entre 1 y 100 .
 */
    public void setDificultad(int dificultad) {
        
        if (dificultad<0){
            this.dificultad = dificultad;
        }else{
            System.out.println("Dificultad invalida se introduce el valor absoluto");
            this.dificultad = Math.abs(dificultad);
        }
        if (dificultad>100){
            System.out.println("Dificultad maxima superada");
            this.dificultad = 100;
        }

    }
/**
 *
 * getter para el nombre del pokemon, no recibe parametros y devuelve un String.
 */
    public String getNombre() {
        return nombre;
    }
/**
 *
 * getter para el ataque del pokemon, no recibe parametros y devuelve un entero.
 */
    public int getAtaque() {
        return Ataque;
    }
/**
 *
 * getter para la defensa del pokemon, no recibe parametros y devuelve un entero.
 */
    public int getDefensa() {
        return Defensa;
    }
/**
 *
 * getter para el ataque especial del pokemon, no recibe parametros y devuelve un entero.
 */
    public int getAtaqueEsp() {
        return ataqueEsp;
    }
/**
 *
 * getter para la defensa epecial del pokemon, no recibe parametros y devuelve un entero.
 */
    public int getDefensaEsp() {
        return defensaEsp;
    }
/**
 *
 * getter para la vida del pokemon, no recibe parametros y devuelve un entero.
 */
    public int getVida() {
        return vida;
    }
 /**
 *
 * getter para la elocidad del pokemon, no recibe parametros y devuelve un entero.
 */
    public int getVelocidad() {
        return velocidad;
    }
/**
 *
 * getter para dificultad del pokemon, no recibe parametros y devuelve un entero.
 */
    public int getDificultad() {
        return dificultad;
    }
    
 /**
 *
 * Método para que el pokemon ataque, no recibe parametros y  no devuelve un nada.
 */   
    public void atacar(){
        System.out.println(this.nombre+" ha atacado");
    }
/**
 *
 * Método para que el pokemon defienda, no recibe parametros y  no devuelve nada.
 */      
    public void defender(){
        System.out.println(this.nombre+" ha defendido");
    }
/**
 *
 * Método para que el pokemon se cure, no recibe parametros y  no devuelve nada.
 */  
    public void curarse(){
        System.out.println(this.nombre+" se ha curado");
    }
/**
 *
 * Método para que el pokemon utilice un objeto, no recibe parametros y  no devuelve nada.
 */  
    public void usarObjeto(){
        System.out.println(this.nombre+" ha usado un objeto");
    }
    
    
}
