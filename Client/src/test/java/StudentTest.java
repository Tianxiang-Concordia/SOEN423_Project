import frontend.StudentService;
import frontend.StudentServiceImplService;

public class StudentTest {
    public static void main(String[] args) {
        StudentServiceImplService studentServiceImplService = new StudentServiceImplService();
        StudentService studentService = studentServiceImplService.getStudentServicePort();

        String response1 = studentService.getAvailableTimeSlot("2021-11-27");
        System.out.println(response1);

        String response2 = studentService.bookRoom("DVL", "101", "2021-11-27", "9:00-10:00","DVLS10000");
        System.out.println(response2);

        String response3 = studentService.getAvailableTimeSlot("2021-11-27");
        System.out.println(response3);
//
//
//        String response4 = studentService.cancelBooking("82E531D132A06AB6B2A0D3E037D87D95", "DVLS10000");
//        System.out.println(response4);
    }
}
