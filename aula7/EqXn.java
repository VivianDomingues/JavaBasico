package aula7;

import java.lang.Math;

public class EqXn extends Equacao{
    private double x1;
    private double x2;

    //#region Metodos de Acesso
    public double getX1() {
        return x1;
    }
    public void setXn(double x1) {
        this.x1 = x1;
    }
    public double getX2() {
        return x2;
    }
    public void setXp(double x2) {
        this.x2 = x2;
    }
    //#endregion

    //#region Regra de Negocio
    public double calculaX1(Delta d){
        x1=(-d.getB() + Math.sqrt(d.getDelta())) / 
        (2 * d.getA());
        return x1;
    }
    
    public double calculaX2(Delta d){
        x2 = (-d.getB() - Math.sqrt(d.getDelta())) / 
        (2 * d.getA());
        return x2;
    }
    //#endregion
}
