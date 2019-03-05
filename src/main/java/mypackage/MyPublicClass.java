package mypackage;

public class MyPublicClass {
    private final MyPackagePrivateInterface myPackagePrivateInterface;

    public MyPublicClass(MyPackagePrivateInterface myPackagePrivateInterface) {
        this.myPackagePrivateInterface = myPackagePrivateInterface;
    }

    public void doStuffOnInner() {
        myPackagePrivateInterface.doStuff();
    }
}
