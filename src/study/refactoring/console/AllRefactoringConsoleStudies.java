package study.refactoring.console;

public class AllRefactoringConsoleStudies {
	
	public static void main(String[] args) {
		try { RefactoringToyExampleStudy.main(args); } catch (Exception e) { show(e); }
		try { SmellRefactoredStudy.main(args); } catch (Exception e) { show(e); }
	}
	
	private static void show(Exception e) {
		// logger.error(e.getMessage());
		 System.out.print(e.getMessage()); 
		 e.printStackTrace();
	}

}
