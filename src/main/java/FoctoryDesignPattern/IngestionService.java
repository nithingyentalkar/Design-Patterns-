package FoctoryDesignPattern;

public class IngestionService {

    FactoryofSource factoryofSource = null;

    public IngestionService(FactoryofSource factoryofSource) {
        this.factoryofSource = factoryofSource;
    }

    public void RetrieveData(String Source){

      IngestToDataBase SystemObject =   factoryofSource.FactoryofData(Source);
        SystemObject.ingestData();
    }
}
