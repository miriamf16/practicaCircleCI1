/*CRUZ SANCHEZ MIRIAM FERNANDA*/

public class Microorganismo {

        private String estado;
        private int vidas;
        private String nombre;

        public Microorganismo(String nombre,int vidamax){
            this.estado="vivo";
            this.nombre=nombre;
            this.vidas=vidamax;
        }

        public int validaVidas(){
            if(vidas == 0 ){
                estado="muerto";
                return 1;
            }
            else
                return 0;

        }

        public void IrLugar(String lugar){
            switch(lugar)
            {
                case "higado":
                    this.vidas = this.vidas >> 1;
                    System.out.println("El"+ this.nombre +"esta en"+lugar+"con"+this.vidas+"vidas");
                    break;
                default:
                    System.out.println("El"+ this.nombre +"esta en"+lugar+"con"+this.vidas+"vidas");
                    break;

            }

        }

        public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
