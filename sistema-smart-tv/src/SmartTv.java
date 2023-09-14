public class SmartTv {
boolean ligada = false;
int canal = 1;
int volume = 25;

//Metodos ligar e desligar
public void ligar(){
    ligada = true;
}

public void desligar(){
    ligada = false;
}
//=========================

//metodo aumentar volume
public void aumentarVolume(){
    volume++;
    System.out.println("aumentando o volume para :"+volume);
}
public void diminuirVolume(){
    volume--;
    System.out.println("diminuindo o volume para :"+volume);
}
//==========================

// metodo para mudar o canal
public void aumentarCanal(){
    canal++;
    System.out.println("aumentando o volume para :"+volume);
}
public void diminuirCanal(){
    canal--;
    System.out.println("diminuindo o volume para :"+volume);
}
public void mudarCanal(int novoCanal){
    canal = novoCanal;
}

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
