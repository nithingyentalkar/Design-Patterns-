package PrototypeAndRegistryDesignPattern;

public class IntelligentStudent extends Student {
    private String  city;

    public IntelligentStudent() {
        super();
    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
      super(intelligentStudent);
    this.city = intelligentStudent.city;
    }

    public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }

    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }


}
