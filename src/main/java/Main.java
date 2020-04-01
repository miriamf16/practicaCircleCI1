/*CRUZ SANCHEZ MIRIAM FERNANDA */


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


        arrayMicro[0] = new Microorganismo("micro1",256);
        arrayMicro[1] = new Microorganismo("micro1",256);
        arrayMicro[2] = new Microorganismo("micro1",256);
        arrayMicro[3] = new Microorganismo("micro4",256);

        int i,j=0;
        int al =0;



        do{

              for(i=0;i<4;i++) {
                    if(j==0) {
                        al = 0;
                    }
                    else{
                        al = (int) Math.floor(Math.random() * 6 + 1);
                    }
              switch (al) {

                   case 0:
                      arrayOrga[al].setTipo(" boca ");
                       System.out.printf(" El microbio %d esta %s en %s con %d%n", i, arrayMicro[i].getEstado(), arrayOrga[al].getTipo(), arrayMicro[i].getVidas());
                       arrayMicro[i].validaVidas();
                       break;
                   case 1:
                       arrayOrga[al].setTipo(" intestinos ");
                       System.out.printf(" El microbio %d esta %s en %s con %d%n", i, arrayMicro[i].getEstado(), arrayOrga[al].getTipo(), arrayMicro[i].getVidas());
                       arrayMicro[i].validaVidas();
                       break;
                   case 2:
                       arrayOrga[al].setTipo(" estomago ");
                       System.out.printf(" El microbio %d esta %s en %s con %d%n", i, arrayMicro[i].getEstado(), arrayOrga[al].getTipo(), arrayMicro[i].getVidas());
                       arrayMicro[i].validaVidas();
                       break;
                   case 3:
                       arrayOrga[al].setTipo(" higado ");
                       System.out.printf(" El microbio %d esta %s en %s con %d%n", i, arrayMicro[i].getEstado(), arrayOrga[al].getTipo(), arrayMicro[i].getVidas());
                       arrayMicro[i].setVidas(arrayMicro[i].getVidas() >> 1);
                       arrayMicro[i].validaVidas();
                       break;
                   case 4:
                       arrayOrga[al].setTipo(" pulmones ");
                       System.out.printf(" El microbio %d esta %s en %s con %d%n", i, arrayMicro[i].getEstado(), arrayOrga[al].getTipo(), arrayMicro[i].getVidas());
                       arrayMicro[i].validaVidas();
                       break;

                   case 5:
                       arrayOrga[al].setTipo(" corazon ");
                       System.out.printf(" El microbio %d esta %s en %s con %d%n", i, arrayMicro[i].getEstado(), arrayOrga[al].getTipo(), arrayMicro[i].getVidas());
                        arrayMicro[i].validaVidas();
                       break;

                   case 6:
                       arrayOrga[al].setTipo(" cerebro ");
                       System.out.printf(" El microbio %d esta %s en %s con %d%n", i, arrayMicro[i].getEstado(), arrayOrga[al].getTipo(), arrayMicro[i].getVidas());
                       arrayMicro[i].validaVidas();
                       break;

               }

          }

            j++;
          } while (arrayMicro[0].getVidas() > 0 | arrayMicro[1].getVidas() > 0 | arrayMicro[2].getVidas() > 0 | arrayMicro[3].getVidas() > 0);



    }


}
