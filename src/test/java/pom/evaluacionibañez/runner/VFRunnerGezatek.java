package pom.evaluacionibañez.runner;

        import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = ("src/test/java/pom.evaluacionibañez/features"),

        glue = {"pom.evaluacionibañez.steps","pom.evaluacionibañez.base"},
        plugin ={"pretty"},
        tags = "@test")

public class VFRunnerGezatek {

}
