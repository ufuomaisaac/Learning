package DesignPatterns;

interface OS {
    void spec();
}

class andriod implements OS {
    public void spec(){
        System.out.println("andriod os");
    }
}

class ios implements OS{
   public void spec() {
        System.out.println("ios os ");
    }
}

class windows implements OS {
   public void spec() {
        System.out.println("windows os");
    }
}

class Factory {
    public OS check (String str) {
        if (str.equals("Open")){
            return new andriod();
        } else if (str.equals("Close")){
            return new ios();
        } else {
            return new windows();
        }
    }
}

public class AbstractFactor2 {
    public static void main (String [] args){
        Factory factory = new Factory();
        OS object = factory.check("");
        object.spec();
    }
}
