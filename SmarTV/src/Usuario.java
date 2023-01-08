public class Usuario {
    public static void main(String[] args) throws Exception {
        SmarTv smarTv = new SmarTv();

        if (smarTv.ligada == true){
        System.out.println("A tv está ligada");
        System.out.println("Volume: "+ smarTv.volume);
        System.out.println("Canal: "+ smarTv.canal);
        }   else {
        System.out.println("A tv está desligada");
        
        }

        smarTv.aumentarVolume();
        System.out.println("Volume: "+ smarTv.volume);

        smarTv.aumentarVolume();
        System.out.println("Volume: "+ smarTv.volume);

        smarTv.aumentarVolume();
        System.out.println("Volume: "+ smarTv.volume);

        smarTv.diminuirVolume();
        System.out.println("Volume: "+ smarTv.volume);

        smarTv.diminuirVolume();
        System.out.println("Volume: "+ smarTv.volume);



        System.out.println("A tv está ligada? "+ !smarTv.ligada);
        System.out.println("A tv está ligada? "+ smarTv.ligada);

    }
}
