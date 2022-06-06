// Класс JvmComprehension загружается с помощью ClassLoaders
// Информация о классе JvmComprehension хранится в MetaSpace

public class JvmComprehension {
    // В стеке (Stack Memory) создаётся фрейм(кадр) main()
    public static void main(String[] args) {
        // 1 В фрейме метода main() создается переменная i примитивного типа int, i присваивается значение 1
        int i = 1;
        // 2 Создается экземпляр класса Object в куче (heap), в стеке в фрейме метода main() создается ссылка на объект
        Object o = new Object();
        // 3 Создается объект Integer со значением 2 в куче, в стеке в фрейме метода main() создаётся ссылка на него
        Integer ii = 2;
        // 4 Создаётся фрейм printAll() в стеке, в фрейм добавляются ссылки на о, ii и переменная i
        printAll(o, i, ii);
        // 7  Создаётся фрейм println() в стеке, добавляется объект типа String в кучу, в фрейм передается ссылка на объект
        // со значением "finished"
        System.out.println("finished");
    }

    // Во время выполнения программы, сборщик мусора (Garbage Collector) собирает
    // неиспользуемые объекты из памяти путем.

    private static void printAll(Object o, int i, Integer ii) {
        // 5 В куче (Heap) создается объект Integer со значением 700,
        // в Стеке (Stack Memory) во фрейме printAll() создается ссылка "uselessVar" на объект в куче (Heap)
        Integer uselessVar = 700;
        // 6 - В Стеке (Stack Memory) создается фрейм println(),
        // куда передаются ссылки "o" на Object в Куче (Heap), "i" на int во фрейме main() в Стеке (Stack Memory),
        // "ii" на Integer в Куче (Heap)
        // В Стеке (Stack Memory) создается фрейм toString()
        System.out.println(o.toString() + i + ii);
    }

}
