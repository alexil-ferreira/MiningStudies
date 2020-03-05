package study.refactoring.android;

import java.util.List;

import org.designroleminer.smelldetector.CarregaSalvaArquivo;
import org.designroleminer.smelldetector.model.LimiarTecnica;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smellrefactored.SmellRefactoredManager;

public class OwntrackStudy {

	static Logger logger = LoggerFactory.getLogger(OwntrackStudy.class);

	public static void main(String[] args) {

		String localFolder = "D:\\Projetos\\_Android\\owntracks";

		String urlRepository = "https://github.com/owntracks/android.git";
		String initialCommit = "1724aa0331387bcb6a514a5409a6411b78d835b3"; // Android-v.0.4.17 - 2014.02.06
		String finalCommit = "9e666c75ee56d1c399f8da217d6903f3e77a2df4"; // Android-v.2.1.3 - 2019.11.01

		String resultFile= System.getProperty("user.dir") + "\\refactoring\\owntracks";

		List<LimiarTecnica> listThresholdsTechiniques = CarregaSalvaArquivo
				.carregarLimiares(System.getProperty("user.dir") + "\\thresholds\\android2020\\");

		listThresholdsTechiniques.addAll(
				CarregaSalvaArquivo.carregarLimiares(System.getProperty("user.dir") + "\\thresholds\\android2020\\owntracks"));

		SmellRefactoredManager manager = new SmellRefactoredManager(urlRepository, localFolder, initialCommit,
				finalCommit, listThresholdsTechiniques, resultFile);
		manager.getSmellRefactoredClasses();
		manager.getSmellRefactoredMethods();
	}
}
