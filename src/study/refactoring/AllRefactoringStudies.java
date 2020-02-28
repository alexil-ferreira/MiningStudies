package study.refactoring;

import study.refactoring.android.AllRefactoringAndroidStudies;
import study.refactoring.console.AllRefactoringConsoleStudies;
import study.refactoring.web.AllRefactoringWebStudies;

public class AllRefactoringStudies {

	public static void main(String[] args) {
		AllRefactoringWebStudies.main(args);
		AllRefactoringConsoleStudies.main(args);
		AllRefactoringAndroidStudies.main(args);
	}

}
