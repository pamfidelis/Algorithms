public class Test {
	public static void main(String[] args) {
		int [] vet = {4, 6, 8, 88, 1, 3, 0, 333};
		
		selectionSort(vet);
		
		for (int i : vet) {
			System.out.println(i);
		}
	}
	
	public static void insertionSort(int [] vet) {		
		for (int i = 1; i < vet.length; i++) {
			int iValor = vet[i];
			for (int j = i - 1; j >= 0; j--) {
				if(iValor < vet[j]) {
					vet[j + 1] = vet[j];
					if (j == 0) {
						vet[j] = iValor;
						break;
					}
				} else {
					vet[j + 1] = iValor;
					break;
				}
			}
		}
	}
	
	public static void selectionSort(int [] vet) {
		for (int i = 0; i < vet.length; i++) {
			int posicaoMenor = i;
			for (int j = vet.length - 1; j > i; j--) {
				if(vet[j] < vet[posicaoMenor]) {
					posicaoMenor = j;
				}
			}
			int aux = vet[i];
			vet[i] = vet[posicaoMenor];
			vet[posicaoMenor] = aux;
		}
	}
	
	public static void quickSort(int [] vet) {
		int pivo = (vet.length - 1)/ 2;
		int left = 0;
		int right = vet.length - 1;
		
		for (int i = 0; i < vet.length; i++) {
			if(vet[left] > pivo )
		}
	}
}
