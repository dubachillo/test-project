public class MassiveSort{
	public static void main(String[] args){
		
		int[] a = {1,3,2,4,6,5,8,7,56,234,214,1, 12332124, 12, 1244, 66, 77, 33};

		int left = 1;
		int right = a.length-1;
		
		for (int k = left; ++left <= right; k = ++left) {

        //Очередную пару рядом стоя́щих элементов 
        //заносим в пару буферных переменных
        int a1 = a[k], a2 = a[left];
        if (a1 < a2) {
                a2 = a1; a1 = a[left];
        }

        //Вставляем больший элемент из пары
        while (a1 < a[--k]) {
                a[k + 2] = a[k];
        }
        a[++k + 1] = a1;
        
        //Вставляем меньший элемент из пары
        while (a2 < a[--k]) {
                a[k + 1] = a[k];
        }
        a[k + 1] = a2;
		}

		//Граничный случай, если в массиве нечётное количество элементов
		//Для последнего элемента применяем сортировку простыми вставками
		int last = a[right];
		while (last < a[--right]) {
				a[right + 1] = a[right];
		}
		a[right + 1] = last;

		for (int i = 0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}

	}
}