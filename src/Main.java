public class Main {

    public static void main(String[] args){
        Microorganismo arrayMicro [] = new Microorganismo[4];
        Organos arrayOrga[] = new Organos[7];

       arrayOrga[0] = new Organos();
        arrayOrga[1] = new Organos();
        arrayOrga[2] = new Organos();
        arrayOrga[3] = new Organos();
        arrayOrga[4] = new Organos();
        arrayOrga[5] = new Organos();
        arrayOrga[6] = new Organos();


        arrayMicro[0] = new Microorganismo();
        arrayMicro[1] = new Microorganismo();
        arrayMicro[2] = new Microorganismo();
        arrayMicro[3] = new Microorganismo();

        int i;
        int aleatorio =0;

       for(i=0;i<4;i++) {

          do{
                //System.out.println(aleatorio);
               switch (aleatorio) {

                   //BOCA
                   case 0:
                      arrayOrga[aleatorio].setTipo("boca");
                       System.out.println(" El microbio"+arrayMicro[i]+"esta en"+ arrayOrga[aleatorio].getTipo() + "con"+ arrayMicro[i].getVidas());
                       break;
                   case 1:
                       arrayOrga[aleatorio].setTipo("intestinos");
                       System.out.println(" El microbio"+arrayMicro[i]+"esta en"+ arrayOrga[aleatorio].getTipo() + "con"+ arrayMicro[i].getVidas());
                       break;
                   case 2:
                       arrayOrga[aleatorio].setTipo("estomago");
                       System.out.println(" El microbio"+arrayMicro[i]+"esta en"+ arrayOrga[aleatorio].getTipo() + "con"+ arrayMicro[i].getVidas());
                       break;
                   case 3:
                       arrayOrga[aleatorio].setTipo("higado");
                       System.out.println(" El microbio"+arrayMicro[i]+"esta en"+ arrayOrga[aleatorio].getTipo() + "con"+ arrayMicro[i].getVidas());
                       arrayMicro[i].setVidas(arrayMicro[i].getVidas()/2);
                       break;
                   case 4:
                       arrayOrga[aleatorio].setTipo("pulmones");
                       System.out.println(" El microbio"+arrayMicro[i]+"esta en"+ arrayOrga[aleatorio].getTipo() + "con"+ arrayMicro[i].getVidas());
                       break;

                   case 5:
                       arrayOrga[aleatorio].setTipo("corazon");
                       System.out.println(" El microbio"+arrayMicro[i]+"esta en"+ arrayOrga[aleatorio].getTipo() + "con"+ arrayMicro[i].getVidas());
                       break;

                   case 6:
                       arrayOrga[aleatorio].setTipo("cerebro");
                       System.out.println(" El microbio"+arrayMicro[i]+"esta en"+ arrayOrga[aleatorio].getTipo() + "con"+ arrayMicro[i].getVidas());
                       break;

               }
               aleatorio = (int) Math.floor(Math.random() * 6 + 1);
           } while (arrayMicro[i].validaVidas()== 0);

       }


    }


}
