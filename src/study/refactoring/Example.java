package study.refactoring;

import java.util.List;

import org.eclipse.jgit.lib.Repository;
import org.refactoringminer.api.GitHistoryRefactoringMiner;
import org.refactoringminer.api.GitService;
import org.refactoringminer.api.Refactoring;
import org.refactoringminer.api.RefactoringHandler;
import org.refactoringminer.rm1.GitHistoryRefactoringMinerImpl;
import org.refactoringminer.util.GitServiceImpl;

public class Example {

	public static void main(String[] args) throws Exception {
		GitService gitService = new GitServiceImpl();
		GitHistoryRefactoringMiner miner = new GitHistoryRefactoringMinerImpl();

		Repository repo = gitService.cloneIfNotExists(
		    "D://Projetos//_Android//refactoring-toy-example",
		    "https://github.com/danilofes/refactoring-toy-example.git");

		miner.detectAll(repo, "master", new RefactoringHandler() {
		  @Override
		  public void handle(String idCommit, List<Refactoring> refactorings) {
		    System.out.println("Refactorings at " + idCommit);
		    for (Refactoring ref : refactorings) {
		      System.out.println(ref.toString());
		    }
		  }
		});

	}

}
