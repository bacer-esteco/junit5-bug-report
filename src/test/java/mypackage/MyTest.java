package mypackage;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class MyTest {

    @Test
    void aTest() {

        MyThreadMessingClass myThreadMessingClass = new MyThreadMessingClass();

        assertEquals(1, myThreadMessingClass.doStuffWithThreads());
    }

    @Test
    void zTest() {
        MyPackagePrivateInterface mock = mock(MyPackagePrivateInterface.class);
        MyPublicClass myPublicClass = new MyPublicClass(mock);

        myPublicClass.doStuffOnInner();

        verify(mock).doStuff();
    }
}