package SingletonDesginPattern;

public class App {

    public static void main(String[] args) {
     ReadMeFile readMeFile = ReadMeFile.getInstanceFile();
        System.out.println(readMeFile.hashCode());

        ReadMeFile readMeFile1 = ReadMeFile.getInstanceFile();
        System.out.println(readMeFile1.hashCode());

        System.out.println(readMeFile.getId() + readMeFile.getName() + readMeFile.getMessageBody());

        System.out.println(readMeFile1.getId() + readMeFile1.getName() + readMeFile1.getMessageBody());
    }
}
