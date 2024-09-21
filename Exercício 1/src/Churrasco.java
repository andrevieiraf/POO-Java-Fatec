public class Churrasco {

    public Churrasco(double qtdCarne) {
        this.qtdCarne = qtdCarne;
    }

    public void verificarConsumo(){
        if((p1.idade >= 0 && p1.idade <= 3) || p1.vegetariana){
            qtdCarne = 0;
        } else if (p1.idade >= 4 && p1.idade <= 12) {
            qtdCarne = 1;
        } else
            qtdCarne = 2;
    }
}
