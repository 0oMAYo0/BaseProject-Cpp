package data;

public class Data {
	private String room;//±Ð«Ç½s¸¹
	private String building;//¨tÀ]
	private int weekday;
	private int classnum;
	
	public Data() {
		room = "N/A";
		building = "N/A";
		weekday = 1;
		classnum = 1;
	}
	public Data(String building, String room, int weekday, int classnum) {
		this.room = room;
		this.building = building;
		this.weekday = weekday;
		this.classnum = classnum;
	}
	
	public int getWeekday() {
		return weekday;
	}
	
	public int getClassNum() {
		return classnum;
	}
	
	public String getRoom() {
		return room;
	}
	public String getBuilding() {
		return building;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public void setNum(int i) {
		this.classnum = i;
	}
	
	//toString
	public String toString() {
		return building+room;
	}
}
