package model;

public class userDTO {

	private int userId;//ユーザid
	private String password;//パスワード
	private String name;//ニックネーム
	private String area;//地域
	private String income;//年収
	private String school;//学歴
	private String gender;//性別
	private String age;//年齢
	private String height;//身長
	private String body;//体型
	private String job;//職種
	private String holiday;//休日
	private String cigar;//タバコ
	private String child;//子供願望
	private String userfree;//自由記入
	private int picId;//画像ID
	private String bloodtype;//血液型
	private String free;//自由入力


	public userDTO() {
	}

	public userDTO(int userId,String password,String name,String area,
				   String income,String school,String gender,String age,String height,String body,String job,
				   String holiday,String cigar,String child,String userfree,int picId) {
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.area = area;
		this.setIncome(income);
		this.school = school;
		this.gender = gender;
		this.setAge(age);
		this.setHeight(height);
		this.body = body;
		this.job = job;
		this.holiday = holiday;
		this.cigar = cigar;
		this.child = child;
		this.userfree = userfree;
		this.picId = picId;
	}


	public int getUserId() {
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}





	public String getSchool() {
		return this.school;
	}
	public void setSchool(String school) {
		this.school = school;
	}


	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}


	public String getJob() {
		return this.job;
	}
	public void setJob(String job) {
		this.job = job;
	}


	public String getHoliday() {
		return this.holiday;
	}
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}


	public String getCigar() {
		return this.cigar;
	}
	public void setCigar(String cigar) {
		this.cigar = cigar;
	}


	public String getChild() {
		return this.child;
	}
	public void setChild(String child) {
		this.child = child;
	}


	public String getUserfree() {
		return this.userfree;
	}
	public void setUserfree(String userfree) {
		this.userfree = userfree;
	}


	public int getPicId() {
		return this.picId;
	}
	public void setPicId(int picId) {
		this.picId = picId;
	}
	public String getBloodtype() {
		return bloodtype;
	}
	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}
	public String getFree() {
		return free;
	}
	public void setFree(String free) {
		this.free = free;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}


}
