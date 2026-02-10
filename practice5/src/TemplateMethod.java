
abstract class ReportGenerator {

    //фіксує послідовність
    public final void generate() {
        System.out.println("Початок генерації звіту");
        collectData();    // Крок 1
        formatReport();   // Крок 2
        export();         // Крок 3
        System.out.println(" Звіт успішно створено");
    }

    protected abstract void collectData();
    protected abstract void formatReport();

    private void export() {
        System.out.println("Експорт: Збереження звіту у файл PDF.");
    }
}

class DailyReport extends ReportGenerator {
    @Override
    protected void collectData() {
        System.out.println("Дані: Збір логів за сьогоднішню добу...");
    }

    @Override
    protected void formatReport() {
        System.out.println("Формат: Створення таблиці з погодинною активністю.");
    }
}

public class TemplateMethod {
    public static void main(String[] args) {
        ReportGenerator myReport = new DailyReport();
        myReport.generate();
    }
}