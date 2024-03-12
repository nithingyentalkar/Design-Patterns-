package FoctoryDesignPattern;

public class FactoryofSource {

    IngestToDataBase ingestToDataBase;
    public IngestToDataBase FactoryofData(String source){

        if(source.equals("File")) ingestToDataBase = new SourceDataFromFile();

        if(source.equals("API")) ingestToDataBase = new SourceDataFromApi();

        if(source.equals("DataBase")) ingestToDataBase = new SourceDataFromDataBase();

        return ingestToDataBase;

    }
}
