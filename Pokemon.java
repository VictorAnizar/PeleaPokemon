
import java.util.Random;

public class Pokemon
{
    private String tipoPoke;
    private String nombre;
    private int puntoVida;
    private int ataque;
    private int defensa;
    private boolean estado;

    public Pokemon(String nombre,int puntoVida,int ataque,int defensa,boolean estado,String tipoPoke){
        this.nombre = nombre;
        this.puntoVida = puntoVida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.estado = estado;
        this.tipoPoke=tipoPoke;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    
    public int atacar()
    {
        Random rnd=new Random();
        int danoTotal=0;
        danoTotal=puntoVida*rnd.nextInt(5);
        return danoTotal;
    }

    public void recibirDano(int danoRecibido){
        this.puntoVida = this.puntoVida - danoRecibido;
        if(puntoVida<=0)
        {
            this.estado=false;
        }
    }
        
    public boolean estaVivo(){
        if(this.puntoVida>0) {
            estado = true;
            return true;
        }else{
            estado = false;
            return false;
        }
    }
    public String getNombre(){
        return this.nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setPuntoVida(double puntoVida) {
        this.puntoVida = (int)puntoVida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getPuntoVida() {
        return puntoVida;
    }

    public String getTipoPoke() {
        return tipoPoke;
    }


}