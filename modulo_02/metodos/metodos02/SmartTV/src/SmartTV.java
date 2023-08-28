public class SmartTV{
    boolean ligada = false;
    int canal = 2;
    int volume = 10;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        if (ligada == true){
            volume++;
            System.out.println("Volume alterado para: " + volume);
        }
    }

    public void diminuirVolume(){
        if (ligada == true){
            volume--;
            System.out.println("Volume alterado para: " + volume);
        }
    }

    public void mudarCanal(int novoCanal){
        if (ligada == true){
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        }
    }
    public void imprimirStatus(){
        System.out.println("A TV está ligada? " + ligada);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }

    public void subirCanal(){
        if (ligada == true){
            canal++;
            System.out.println("Canal alterado para: " + canal);
        }
    }

    public void descerCanal(){
        if (ligada == true){
            canal--;
            System.out.println("Canal alterado para: " + canal);
        }
    }

}