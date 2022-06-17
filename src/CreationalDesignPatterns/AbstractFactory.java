package DesignPatterns;

interface IMobile {
    IAndroid GetAndroidPhone();
    IiOS GetiOSPhone();
}

class Samsung implements IMobile {
    public IAndroid GetAndroidPhone() {
        return new SamsungGalaxy();
    }

    public IiOS GetiOSPhone() {
        return new SamsungGuru();
    }
}

interface IAndroid {
    String GetModelDetails();
}

interface IiOS {
    String GetModelDetails();

}

class SamsungGalaxy implements IAndroid {
    public String GetModelDetails() {
        return "Model: Samsung Galaxy - RAM: 2GB - Camera: 13MP";
    }
}

class SamsungGuru implements IiOS {
    public String GetModelDetails() {
        return "Model: Samsung Guru - RAM: N/A - Camera: N/A";
    }
}

class MobileClient {
    IAndroid andriodPhone;
    IiOS iOSPhone;

    public MobileClient(IMobile factory) {
        andriodPhone = factory.GetAndroidPhone();
        iOSPhone = factory.GetiOSPhone();
    }

    public String GetAndroidPhoneDetails() {
        return andriodPhone.GetModelDetails();
    }


    public String GetiOSPhoneDetails() {
        return iOSPhone.GetModelDetails();
    }
}

public class AbstractFactory {
    public static void main(String[] args){
        IMobile samsungMobilePhone = new Samsung();
        MobileClient samsungClient = new MobileClient(samsungMobilePhone);
        System.out.println(samsungClient.GetAndroidPhoneDetails());
        System.out.println(samsungClient.GetiOSPhoneDetails());
    }
}
