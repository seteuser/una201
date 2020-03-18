public class RegraINSS {

	/**
	* verifica se um cidadao está liberado ou pendente de aposentadoria
	* considerando sua idade e sua regra para aposentadoria, 60 ou 65
	*/
	public boolean aposentado(int i, int s) {

		int calculo;

		
		if (s == 1)
			calculo = 65 - i;
		else
			calculo = 60 - i;

		
		if (calculo <= 0) {
			return true;
		} else {
			return false;
		}

	}

	/**
	* dvolve a pendencia (int), em anos, considerando a 
	* idade do cidadao e sua regra para aposentadoria, 60 ou 65
	*/
	public int pendencia(int i, int s) {

		int calculo;
		
		if (s == 1)
			calculo = 65 - i;
		else
			calculo = 60 - i;

		if (calculo <= 0) {
			return 0;
		} else {
			return calculo;
		}

    }
}