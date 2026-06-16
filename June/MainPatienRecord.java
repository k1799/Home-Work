
package June;


public class MainPatienRecord {
    public static void main(String[] args) {
        
        PatientRecord patient=new PatientRecord.Builder()
                .setPatientName("Kannan")
                .setAge(26)
                .setDisease("Fever")
                .setRoomType("Deluxe")
                .setBillAmount(15000)
                .setDoctorName("Dr.Vinayaga")
                .build();
        patient.displayDetails();
    }
  
}
