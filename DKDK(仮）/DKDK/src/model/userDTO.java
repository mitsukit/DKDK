package model;

public class userDTO{

	private int userId;//ユーザid
	private String password;//パスワード
	private String name;//ニックネーム
	private int address_id;//地域
	private int income_id;//年収
	private int education_id;//学歴
	private int gender_id;//性別
	private int age_id;//年齢
	private int height_id;//身長
	private int body_id;//体型
	private int job_id;//職種
	private int holiday_id;//休日
	private int smoking_id;//タバコ
	private int children_id;//子供願望
	private int pic_id;//画像ID
	//private String free;//自由入力

	AddressDTO adDto;
	IncomeDTO inDto;
	EducationDTO edDto;
	GenderDTO genDto;
	AgeDTO ageDto;
	HeightDTO heiDto;
	BodyDTO bodyDto;
	JobDTO jobDto;
	HolidayDTO holDto;
	SmokingDTO smoDto;
	ChildrenDTO chiDto;

	public userDTO() {
	}

	/*引数に入れたもの(DBから取りだしたデータ）を
	 * DTOのフィールドにセットしてカプセル化するコンストラクター
	 * 　｜・DAOにて、loginCheckメソッドとselectByIdメソッドの戻り値として使用｜
	 * 　｜・マイページとプロフィールページで全情報を表示する際に使用　　　　　　　｜
	 * 注意：引数に入れる順番を守る
	 */
	public userDTO(int userId,String password,String name,String address,
				   String income,int educationId,int genderId,int ageId,int heightId,int bodyId,
				   int jobId,int holidayId,int smokingId,int childrenId,int picId) {
		this.userId = userId;
		this.password = password;
		this.name = name;
		adDto.setAddress(address);
		inDto.setIncome(income); //==============================================================================
		this.education_id = educationId;
		this.gender_id = genderId;
		this.age_id = ageId;
		this.height_id = heightId;
		this.body_id = bodyId;
		this.job_id = jobId;
		this.holiday_id = holidayId;
		this.smoking_id = smokingId;
		this.children_id = childrenId;
		this.pic_id = picId;
		//this.free = free;
	}

	//ゲッター、セッター
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
	/*
	 * AddressDTO adDto;
	IncomeDTO inDto;
	EducationDTO edDto;
	GenderDTO genDto;
	AgeDTO ageDto;
	HeightDTO heiDto;
	BodyDTO bodyDto;
	JobDTO jobDto;
	HolidayDTO holDto;
	SmokingDTO smoDto;
	ChildrenDTO chiDto;
	 *
	 * */
	public AddressDTO getAddress()
	{
		return new AddressDTO();
	}
	public IncomeDTO getIncome()
	{
		return new IncomeDTO();
	}
	public EducationDTO getEducation()
	{
		return new EducationDTO();
	}
	public AgeDTO getAge()
	{
		return new AgeDTO();
	}
	public HeightDTO getHeight()
	{
		return new HeightDTO();
	}
	public BodyDTO getBody()
	{
		return new BodyDTO();
	}
	public JobDTO getJob()
	{
		return new JobDTO();
	}
	public HolidayDTO getHoliday()
	{
		return new HolidayDTO();
	}
	public SmokingDTO getSmoking()
	{
		return new SmokingDTO();
	}
	public ChildrenDTO getChildren()
	{
		return new ChildrenDTO();
	}
	public GenderDTO getGender()
	{
		return new GenderDTO();
	}
	public PictureDTO getPicture()
	{
		return new PictureDTO();
	}

	//仮メソッド
	/*
	 public userDTO getAllAttributes()
	{
		adDto;
		inDto;
		edDto;
		genDto;
		ageDto;
		heiDto;
		bodyDto;
		jobDto;
		holDto;
		smoDto;
		chiDto;
	}
	*/

}
