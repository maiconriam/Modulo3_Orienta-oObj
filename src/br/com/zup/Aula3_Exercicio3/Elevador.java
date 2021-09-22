package br.com.zup.Aula3_Exercicio3;

public class Elevador {
    private int terreo = 0;
    private int andares;
    private double capacidade;
    private int pessoas;
    private int andarAtual;

    public Elevador(int andarAtual, int andares, double capacidade, int pessoas){
        this.andarAtual = andarAtual;
        this.andares = andares;
        this.capacidade = capacidade;
        this.pessoas = pessoas;
    }

    public int getTerreo() {
        return terreo;
    }

    public int getAndares() {
        return andares;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setTerreo(int terreo) {
        this.terreo = terreo;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void mostrarDados(){
        System.out.println("Você está no " + getAndarAtual() + "º andar");
        System.out.println("O prédio tem " + getAndares() + "º andar");
        System.out.println("O elevador tem capacidade de: " + getCapacidade() + " pessoas por vez");
        System.out.println("No momento tem " + getPessoas() + " pessoas no elevador");
    }

    public void entrar(int pessoaEntrando){
        if(getCapacidade() >= getPessoas() + pessoaEntrando){
            setPessoas(getPessoas() + pessoaEntrando);
            System.out.println("Entrou " + pessoaEntrando + " pessoas");
            System.out.println("Agora tem " + getPessoas() + " dentro do elevador");
        }else{
            System.out.println("Ocupação maxima permitida, por favor espere o proximo elevador");
        }
    }

    public void sair(int pessoaSaindo){
        if (pessoaSaindo > 0){
            if(getPessoas() >= pessoaSaindo){
                setPessoas(getPessoas() - pessoaSaindo);
                System.out.println("Saiu " + pessoaSaindo + " pessoas do elevador");
                System.out.println("Agora tem " + getPessoas() + " dentro do elevador");
            }else{
                System.out.println("Não tem esse número de pessoas no elevador");
            }
        }else{
            System.out.println("O elevador está vazio.");
        }
    }

    public void sobe(int subindo){
        if (subindo >= getTerreo()){
            if(getAndares() >= getAndarAtual() + subindo ){
                setAndarAtual(getAndarAtual() + subindo);
                System.out.println("Você subiu para o " + getAndarAtual() + "º andar");
            }else{
                System.out.println("O prédio só tem " + getAndares() + "º andares");
            }
        }
    }

    public void desce(int descer){
        if (getAndarAtual() > getTerreo()){
            if(getAndarAtual() - descer > getTerreo()){
                setAndarAtual(getAndarAtual() - descer);
                System.out.println("Você desceu para o " + getAndarAtual() + "º andar");
            }if(getAndarAtual() - descer == getTerreo()){
                System.out.println("Você desceu " + descer + "º andares e agora está no terreo");
            }else{
                System.out.println("O elevador não consegue passar do chão");
        }
    }
}}
