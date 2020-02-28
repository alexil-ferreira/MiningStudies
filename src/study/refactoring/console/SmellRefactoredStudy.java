package study.refactoring.console;

import java.util.List;

import org.designroleminer.smelldetector.CarregaSalvaArquivo;
import org.designroleminer.smelldetector.model.LimiarTecnica;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smellrefactored.SmellRefactoredManager;

public class SmellRefactoredStudy {

	static Logger logger = LoggerFactory.getLogger(SmellRefactoredStudy.class);

	public static void main(String[] args) {

		String localFolder = "D:\\Projetos\\_Console\\SmellRefactored";
		String urlRepository = "https://github.com/alexil-ferreira/SmellRafactored.git";
		String initialCommit = "ac2252824a2d326763610e869145a8a70bf0c1b7";
		String finalCommit = "58652f323a05808d2031faf6f2d4ea3bee9c819d";
		String resultFile = System.getProperty("user.dir") + "\\refactoring\\SmellRefactored";

		List<LimiarTecnica> listThresholdsTechiniques = CarregaSalvaArquivo
				.carregarLimiares(System.getProperty("user.dir") + "\\thresholds\\simple\\");

		SmellRefactoredManager manager = new SmellRefactoredManager(urlRepository, localFolder, initialCommit,
				finalCommit, listThresholdsTechiniques, resultFile);
		manager.getSmellRefactoredClasses();
		manager.getSmellRefactoredMethods();
	}

}
