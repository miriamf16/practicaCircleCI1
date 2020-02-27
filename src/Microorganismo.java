public class Microorganismo {

        private String estado;
        private int vidas;

        public Microorganismo(){
            this.estado="vivo";
            this.vidas=256;
        }

        public int validaVidas(){
            if(vidas == 0 ){
                estado="muerto";
                return 1;
            }
            else
                return 0;

        }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
