public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv  smartTV = new SmartTv();
        
        System.out.println("TV ligada ? "+smartTV.ligada);
        System.out.println("Canal atual: "+smartTV.canal);
        System.out.println("Volume atual: "+smartTV.volume);

        //teste ligar e desligar
        smartTV.ligar();
        System.out.println("Novo Status --> TV ligada ? "+smartTV.ligada);
        smartTV.desligar();
        System.out.println("Novo Status --> TV ligada ? "+smartTV.ligada);
        //========================

        // teste aumentar volume
        smartTV.diminuirVolume();//chamei o metodo que diminui o volume 1 vez
        smartTV.diminuirVolume();//diminui o volume denovo
        smartTV.diminuirVolume();//diminui o volume denovo
        smartTV.aumentarVolume();//aqui aumentei o volume uma vez
        System.out.println("volume atual : "+smartTV.volume);

        // teste mudar de canal
        System.out.println("Canal atual: "+smartTV.canal);// busca o canal setado na variavel

        smartTV.mudarCanal(13);// setei o 13 como novo parametro
        System.out.println("Canal atual: "+smartTV.canal);// chamei o metodo canal que recebe o novo canal

        
        
    }
}
