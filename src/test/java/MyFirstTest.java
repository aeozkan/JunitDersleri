import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;

class MyFirstTest {
    @BeforeAll // Junit 5'de @BeforeClass'ın yerine
    public static void beforeAllMyClass(){
        System.out.println("class'dan önce");
    }
    @BeforeClass //JUnit 4'de kaldığı için çalışmıyor
    public static void beforeMyClass(){
        System.out.println("class'dan önce");
    }
    @BeforeEach //Junit 4'de @Before olarak kullanılıyordu
    public void beforeTest(){
        System.out.println("testten önce");
    }
    @Test
    public void myTest1(){
        System.out.println("my test 1");
    }
    @Test
    public void myTest2(){
        System.out.println("my test 2");
    }
    @AfterEach //Junit 4'de @After olarak kullanılıyordu
    public void afterTest(){
        System.out.println("testten sonra");
    }
    @AfterClass //JUnit 4'de kaldığı için çalışmıyor
    public static void afterMyClass(){
        System.out.println("class'dan sonra");
    }
    @AfterAll // Junit 5'de @AfterClass'ın yerine
    public static void afterAllMyClass(){
        System.out.println("class'dan sonra");
    }

}
