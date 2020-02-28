package study.refactoring.web;

import java.util.List;

import org.designroleminer.smelldetector.CarregaSalvaArquivo;
import org.designroleminer.smelldetector.model.LimiarTecnica;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smellrefactored.SmellRefactoredManager;

public class BonitaWebStudy {

	static Logger logger = LoggerFactory.getLogger(BonitaWebStudy.class);

	public static void main(String[] args) {

		String localFolder = "D:\\Projetos\\_Web\\bonita-web";
		String urlRepository = "https://github.com/bonitasoft/bonita-web.git";
		String initialCommit = "0d17b82f8e2819b671bd342b0a8d6ea4304247b7"; // 6.0.3 - 2013.08.01
		String finalCommit = "51996f324618b1f5a2e50aa3bd9d06f478911ae7"; // 7.10.0 - 2019.11.28
		String resultFile= System.getProperty("user.dir") + "\\refactoring\\bonita-web";

		List<LimiarTecnica> listThresholdsTechiniques = CarregaSalvaArquivo
				.carregarLimiares(System.getProperty("user.dir") + "\\thresholds\\web2020\\");

		listThresholdsTechiniques.addAll(
				CarregaSalvaArquivo.carregarLimiares(System.getProperty("user.dir") + "\\thresholds\\web2020\\bonita-web"));

		SmellRefactoredManager manager = new SmellRefactoredManager(urlRepository, localFolder, initialCommit,
				finalCommit, listThresholdsTechiniques, resultFile);
		manager.getSmellRefactoredClasses();
		manager.getSmellRefactoredMethods();
	}
}
