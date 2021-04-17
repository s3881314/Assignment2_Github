// each action should be noted with day+time and id of staff member
// exception should be raised if staff is not authorized to do the action or is not rostered in for that day+time

// set a super class staff
// set MedicalStaff and NonMedicalStaff classes to extend staff class
class Staff
{
	private String ID;
	private String Position;

	Staff(String id, String p){
		ID = id;
		Position = p;
	}
}

class MedicalStaff extends Staff {
	// doctor and nurse
	// allow manager add staff (doctors, nurses) or modify ID, password and shift days/times
	// medical staff is able to check resident's detail
	// allow nurse to move resident to another bed
	// detail for administering medicine
	private String Password;
	private String ShiftDaysTimes;

	MedicalStaff(String id, String p, String sdt){
		super(id, p);
		ShiftDaysTimes = sdt;
	}
	void AddNewStaff(String id2, String p2, String sd2, String st2){
		MedicalStaff NewStaff = new MedicalStaff(id2, p2, sd2, st2);
	}
	void ModifyID(){

	}
	void ModifyPassword(){

	}
	void ModifyShiftDayTime(){

	}
}
class NonMedicalStaff extends Staff {
	// manager
	NonMedicalStaff(String id, String p){
		super(id, p);
	}
}
class Resident{
	// Resident
	// ID, gender, prescription, bed
	private String ID;
	private String Gender;
	private String Prescription;
	private String Bed;
	private String MedicineAdminisering = null;

	Resident(String id, String g, String p, String b){
		this.ID = id;
		this.Gender = g;
		this.Prescription = p;
		this.Bed = b;

	}
	void AddResident(String id2, String g2, String p2, String b2){
		Resident NewResident = new Resident(id2, g2, p2, b2);
	}
	String getPrescription(){

	}
	String AttachPrescription(String b){ // b for bed

	}
	void MovingBed(String b1, String b2){ // move resident from b1 to b2

	}
	void UpdatingMedicineAdministering(){

	}
}

public class AbleCareHome {
	public static void main(String[] args) {


	}
}
