import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class FindCurrentDateAndTime_1 {
	public static void main(String[] args) {
		
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-mm-yyyy  HH:mm:ss");

		String formatted = current.format(pattern);
		
		System.out.println(formatted);
	}
}
