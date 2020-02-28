package study;

import study.metric.AllMetricStudies;
import study.refactoring.AllRefactoringStudies;
import study.similarity.AllSimilarityStudies;
import study.smell.AllSmellStudies;
import study.threshold.AllThresholdStudies;

public class AllStudies {

	public static void main(String[] args) {
		AllMetricStudies.main(args);
		AllSimilarityStudies.main(args);
		AllThresholdStudies.main(args);
		AllSmellStudies.main(args);
		AllRefactoringStudies.main(args);
	}

}
