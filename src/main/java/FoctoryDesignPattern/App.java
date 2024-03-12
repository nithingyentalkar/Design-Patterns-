package FoctoryDesignPattern;

public class App {
    public static void main(String[] args) {

        FactoryofSource factoryofSource = new FactoryofSource();

         IngestionService ingestionService = new IngestionService(factoryofSource);
        ingestionService.RetrieveData("DataBase");


    }
}
