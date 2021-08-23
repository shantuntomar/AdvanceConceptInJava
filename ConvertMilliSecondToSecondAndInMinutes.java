import java.util.concurrent.TimeUnit;

class ConvertMilliSecondToSecondAndInMinutes {
	public static void main(String[] args) {

		//enter millisecond 
		long milliseconds =  1000000;

		//milliseconds -> seconds 
		long sec = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		System.out.println(milliseconds+" "+"Milliseconds"+" = "+sec+" seconds ");

		//milliseconds -> minutes 
		long min = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
		System.out.println(milliseconds+" "+"Milliseconds"+" = "+min+" Minutes ");
	}
}
