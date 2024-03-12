package FoctoryDesignPattern;

public class SourceDataFromApi implements IngestToDataBase{

    @Override
    public void ingestData() {
        System.out.println("Read Data from API");
    }
}
