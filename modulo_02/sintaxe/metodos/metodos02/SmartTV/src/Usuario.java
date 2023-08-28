public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        smartTV.imprimirStatus();

        smartTV.ligar();
        System.out.println("Novo status: A TV está ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo status: A TV está ligada? " + smartTV.ligada);

        smartTV.ligar();
        System.out.println("Novo status: A TV está ligada? " + smartTV.ligada);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        System.out.println("Novo status: Volume: " + smartTV.volume);

        smartTV.mudarCanal(30);

        smartTV.imprimirStatus();

    }
}
