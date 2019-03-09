package heapSort;

public class HeapSort_Tests {

	public static int [] gerarNums(int n){
		int array[]= new int[n];
		for(int i=0;i<n;i++)
			array[i]=(int)(Math.random()*100);	//	Porque Math.random gera double e só aceita inteiro
		return array;
	}
	
	public static void printArray(int array[]) {
        // Mostra o vetor "array" na tela
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length) - 2) {
                System.out.print("Posição " + i + ": (" + array[i] + ") e ");
            } else if (!(i == (array.length) - 1)) {
                System.out.print("Posição " + i + ": (" + array[i] + "), ");
            } else {
                System.out.print("Posição " + i + ": (" + array[i] + ")");
            }
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= gerarNums(11);
		System.out.println("Vetor nao ordenado");
		printArray(array);
		
		HeapSort heapSort = new HeapSort(array);
		heapSort.Sort();
		
		System.out.println("Vetor ordenado");
		printArray(heapSort.returnSortedArray());
	}

}
