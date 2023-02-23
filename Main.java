public class Main {
    public static void main(String[] args) {

        HumansGenerator generator = new HumansGenerator();
        HumansTablePrinter printer = new HumansTablePrinter();
        HumansStatistic statistic = new HumansStatistic();
        Human humans[] = generator.generate(1000);

        printer.printTable(humans);

        int ages[] = statistic.getAgesStatistic(humans);

        System.out.println();
        System.out.println();

        printer.printTable(ages);
    }
}

