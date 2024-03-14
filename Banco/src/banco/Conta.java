/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author walis
 */
public class Conta {
    //ATRIBUTOS:
    private String nomeTitular;
    private int numero;
    private double saldo;
    
    public Conta(int numero, String nomeTitular, double saldo){
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    public Conta(int numero, String nomeTitular){
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }
    public String getNomeTitular(){
        return this.nomeTitular;
    } //Fim do getNomeTitular
    
    public int getNumero(){
        return this.numero;
    } //Fim do getNumero
    public double getSaldo(){
        return this.saldo;
    } //Fim do getSaldo
    
    //MÉTODOS DEPOSITAR E SACAR:
    public void depositar(double valorDepositado){
        this.saldo += valorDepositado;
    } //Fim do metodo depositar.
    
    public boolean sacar(double valorSacado){
       if (this.saldo >= valorSacado){
           this.saldo -= valorSacado;
           return true;
       } else {
           return false;
       } // Fim do "IF, ELSE"
    } //Fim do metodo sacar
}
