public class New extends Other {


    @SuppressWarnings("unused")
            // подавляем предупреждение, что переменная не используется
    int sum;
 /*   @Override // это аннотация
    public int sum() {
        return sum / 2;
    }*/

    @Override
    public int sum() {
        return number / 2;
    }
    @Deprecated
    // указывает что метод устарел и далее не будет поддерживаться
    public void oldMethod() {
    }
    // Deprectated можно установить диапазон
    @Deprecated(since = "5.3", forRemoval = true)
    // since = требует версию в которой аннотируемый элемент является не
    // поддерживаемым. Дефолтное значение - пустая строка
    // forRemoval - булевое значение, является индикаторам что аннотируемый
    // элемент будет удален в будущей версии. Дефолтное значение - false
    public void printHello2() {
        System.out.println("Hello!");
    }
    // что означает, наш метод printHello2 не будет поддерживаться с версии
    // 5.3 нашей библиотеки, и будет удален в следующем релизе.

    @SuppressWarnings("unused")
    public void printHello() {
        System.out.println("Hello!");
    }
    @SuppressWarnings({"all", "unused"})
    // подавили предупреждение о делении на ноль
    // можно объединить подавление сразу нескольких предупреждений в массиве
    public int divide() {
        return 2 / 0;
    }


}
