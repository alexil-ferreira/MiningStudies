package study.refactoring.android;

import java.util.List;

import org.designroleminer.smelldetector.CarregaSalvaArquivo;
import org.designroleminer.smelldetector.model.LimiarTecnica;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smellrefactored.SmellRefactoredManager;

public class SkyTubeStudy {

	static Logger logger = LoggerFactory.getLogger(SkyTubeStudy.class);

	public static void main(String[] args) {

		String localFolder = "D:\\Projetos\\_Android\\SkyTube";
		String resultFile= System.getProperty("user.dir") + "\\refactoring\\SkyTube";
		String urlRepository = "https://github.com/ram-on/SkyTube.git";
		String finalCommit = "3bae84ea36de271f372f1a89db0764c7070aa034"; // v2.970 - 2020.01.26
		String initialCommit = "921a496733b1843b234c2324ddd8a565d967f688"; // v1.0 - 2016.02.24
		
		List<LimiarTecnica> listThresholdsTechiniques = CarregaSalvaArquivo
				.carregarLimiares(System.getProperty("user.dir") + "\\thresholds\\android2020\\");

		listThresholdsTechiniques.addAll(
				CarregaSalvaArquivo.carregarLimiares(System.getProperty("user.dir") + "\\thresholds\\android2020\\SkyTube"));

		SmellRefactoredManager manager = new SmellRefactoredManager(urlRepository, localFolder, initialCommit,
				finalCommit, listThresholdsTechiniques, resultFile);
		manager.getSmellRefactoredClasses();
		manager.getSmellRefactoredMethods();
	}
}
