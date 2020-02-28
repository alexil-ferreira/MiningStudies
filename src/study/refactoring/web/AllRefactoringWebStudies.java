package study.refactoring.web;

public class AllRefactoringWebStudies {
	
	public static void main(String[] args) {
		try { AetStudy.main(args); } catch (Exception e) { show(e); }
		try { BamboobscStudy.main(args); } catch (Exception e) { show(e); }
		try { BigBlueButtonStudy.main(args); } catch (Exception e) { show(e); }
		try { BonitaWebStudy.main(args); } catch (Exception e) { show(e); }
		try { DroolsWBStudy.main(args); } catch (Exception e) { show(e); }
		try { DWSurveyStudy.main(args); } catch (Exception e) { show(e); }
		try { DxaStudy.main(args); } catch (Exception e) { show(e); }
		try { GeoweStudy.main(args); } catch (Exception e) { show(e); }
		try { HawtioStudy.main(args); } catch (Exception e) { show(e); }
		try { Heritrix3Study.main(args); } catch (Exception e) { show(e); }
		try { IceStudy.main(args); } catch (Exception e) { show(e); }
		try { KafkaStudy.main(args); } catch (Exception e) { show(e); }
		try { LibreplanStudy.main(args); } catch (Exception e) { show(e); }
		try { MesStudy.main(args); } catch (Exception e) { show(e); }
		try { MetlStudy.main(args); } catch (Exception e) { show(e); }
		try { OpenmpfStudy.main(args); } catch (Exception e) { show(e); }
		try { OpenMRSStudy.main(args); } catch (Exception e) { show(e); }
		try { OptawebStudy.main(args); } catch (Exception e) { show(e); }
		try { PhenotipsStudy.main(args); } catch (Exception e) { show(e); }
		try { ProjectForgeStudy.main(args); } catch (Exception e) { show(e); }
		try { WeasisStudy.main(args); } catch (Exception e) { show(e); }
		// try { WebannoStudy.main(args); } catch (Exception e) { show(e); }
		try { WebBudgetStudy.main(args); } catch (Exception e) { show(e); }
		try { WebofneedsStudy.main(args); } catch (Exception e) { show(e); }
		try { WebprotegeStudy.main(args); } catch (Exception e) { show(e); }
		try { ZkspreadsheetStudy.main(args); } catch (Exception e) { show(e); }
	}
	
	private static void show(Exception e) {
		// logger.error(e.getMessage());
		 System.out.print(e.getMessage()); 
		 e.printStackTrace();
	}

}
