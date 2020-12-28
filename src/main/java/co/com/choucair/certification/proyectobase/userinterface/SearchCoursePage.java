package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona la Universidad choucair")
            .located(By.xpath("//div[@id='certificaciones']//strong[contains(text(),'Cursos y')]"));//Se busca el curso certificsción para hacer la prueba
    public static final Target INPUT_COURSE=Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO= Target.the("Da click para buscar el curso")
            .located(By.xpath("//button[@type='submit']"));
    public static final Target SELECT_COURSE= Target.the("Da click para seleccionar el curso")
            .located(By.xpath("//a[@href='https://operacion.choucairtesting.com/academy/course/view.php?id=1279']"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//div[@class='page-header-headings']//h1[contains(text(),'Prueba')]"));
   /* public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
           .located(By.xpath("//span[@class='instancename'][contains(text(),'Foro de Bienvenida')]"));*/


}
