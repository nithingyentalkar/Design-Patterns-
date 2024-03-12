package SingletonDesginPattern;

public class ReadMeFile {
private volatile static ReadMeFile readMeFile = null;

private int id;
private String name;
private String messageBody;

    public ReadMeFile(){
    }

    public static ReadMeFile getInstanceFile(){
        if(readMeFile==null){
            synchronized (ReadMeFile.class){
                if (readMeFile==null) {
                    readMeFile = new ReadMeFile();

                }
            }
        }
        return readMeFile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
}
