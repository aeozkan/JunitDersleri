import org.junit.*;

public class dependencyTest {
    @BeforeClass
    public static void depBeforeClass(){
        System.out.println("dep before class");
    }
    @Before
    public void depBefore(){
        System.out.println("dep before");
    }
    @Test
    public void depTest1(){
        System.out.println("dep Test1");
    }
    @Test
    public void depTest2(){
        System.out.println("dep Test2");
    }
    @After
    public void depAfter(){
        System.out.println("dep after");
    }
    @AfterClass
    public static void depAfterClass(){
        System.out.println("dep after class");
    }
}
