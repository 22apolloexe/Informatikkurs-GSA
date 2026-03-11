// Aufgabe 1: Array erzeugen (nur Ausgabe)
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Aufgabe 2: Suche im Array
    static int searchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1; // Standard-Rückgabe, falls nichts gefunden wurde
    }

    // Aufgabe 3: Vertauschen von Werten
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Aufgabe 4: Umkehren eines Arrays
    static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            swap(array, left, right);
            left++;
            right--;
        }
    }

    // Aufgabe 5: Kopieren eines Arrays
    static int[] cloneArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    // Aufgabe 6: Maximum/Minimum bestimmen
    static int maximum(int[] a) {
        return a[maxIndex(a)];
    }

    static int minimum(int[] a) {
        return a[minIndex(a)];
    }

    static int maxIndex(int[] a) {
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[max]) {
                max = i;
            }
        }
        return max;
    }

    static int minIndex(int[] a) {
        int min = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[min]) {
                min = i;
            }
        }
        return min;
    }