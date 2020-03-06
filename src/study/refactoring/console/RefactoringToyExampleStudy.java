package study.refactoring.console;

import java.util.List;

import org.designroleminer.smelldetector.CarregaSalvaArquivo;
import org.designroleminer.smelldetector.model.LimiarTecnica;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smellrefactored.SmellRefactoredManager;

public class RefactoringToyExampleStudy {

	static Logger logger = LoggerFactory.getLogger(RefactoringToyExampleStudy.class);

	public static void main(String[] args) {

		String localFolder = "D:\\Projetos\\_Console\\refactoring-toy-example";
		String urlRepository = "https://github.com/danilofes/refactoring-toy-example.git";
		String initialCommit = "819b202bfb09d4142dece04d4039f1708735019b"; // Initial commit
		String finalCommit = "d4bce13a443cf12da40a77c16c1e591f4f985b47"; // 2015.06.10 
		String resultFile = System.getProperty("user.dir") + "\\refactoring\\refactoring-toy-example";

		List<LimiarTecnica> listThresholdsTechiniques = CarregaSalvaArquivo
				.carregarLimiares(System.getProperty("user.dir") + "\\thresholds\\simple\\");

		SmellRefactoredManager manager = new SmellRefactoredManager(urlRepository, localFolder, initialCommit,
				finalCommit, listThresholdsTechiniques, resultFile);
		manager.getSmellRefactoredClasses();
		manager.getSmellRefactoredMethods();
	}

}
