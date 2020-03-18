public class RegraINSS {


    /**
	* responsabilidade interna que devolve o calculo de acordo com a 
	* idade do cidadao e sua regra para aposentadoria, 60 ou 65
	*/
	private int calculo(final int i, final int s) {

        int result;

        if (s == 1)
            result = 65 - i;
        else
            result = 60 - i;

        if (result <= 0) {
            return 0;
        } else {
            return result;
        }

    }

    /**
     * verifica se um cidadao está liberado ou pendente de aposentadoria
     * considerando sua idade e sua regra para aposentadoria, 60 ou 65
     */
    public boolean aposentado(final int i, final int s) {

        if (this.calculo(i, s) == 0) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * devolve a pendencia (int), em anos, considerando a idade do cidadao e sua
     * regra para aposentadoria, 60 ou 65
     */
    public int pendencia(int i, int s) {

		return this.calculo(i, s);

    }
}