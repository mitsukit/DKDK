package controller;

import java.util.ArrayList;
import java.util.List;

import controller.base.BaseService;
import model.userDAO;
import model.userDTO;
import util.DBManager;

public class UpdateService extends BaseService {

	public UpdateService() throws Exception {
		super(true);
	}

	public enum UPDATE_MODE {
		 INSERT
		,UPDATE
	}

	/**
	 * 社員の登録・更新を行う
	 * @param emp
	 * @return
	 * @throws Exception
	 */
	public int registEmployee(userDTO emp, UPDATE_MODE mode) throws Exception {
		userDAO dao = new userDAO(this.con);
		int count = -1;

		try {
			if (mode == UPDATE_MODE.UPDATE){
				// DAO -> List<Object>（DAO#updateを呼び出すため）
				List<Object> paramList = new ArrayList<>();
				paramList.add(emp.getUserId());
				paramList.add(emp.getPassword());
				paramList.add(emp.getName());

				if (emp.getArea() !=null) {
				paramList.add(emp.getArea());
				}
				if (emp.getIncome() !=null) {
				paramList.add(emp.getIncome());
				}
				if (emp.getSchool() !=null) {
				paramList.add(emp.getSchool());
				}
				if (emp.getGender() !=null) {
				paramList.add(emp.getGender());
				}
				if (emp.getAge() !=null) {
				paramList.add(emp.getAge());
				}
				if (emp.getHeight() !=null) {
					paramList.add(emp.getHeight());
				}
				if (emp.getBody() !=null) {
				paramList.add(emp.getBody());
				}
				if (emp.getJob() !=null) {
				paramList.add(emp.getJob());
				}
				if (emp.getHoliday() !=null) {
				paramList.add(emp.getHoliday());
				}
				if (emp.getCigar() !=null) {
				paramList.add(emp.getCigar());
				}
				if (emp.getChild() !=null) {
				paramList.add(emp.getChild());
				}
				paramList.add(emp.getUserfree());
				paramList.add(emp.getPicId());

				if (emp.getBloodtype()!=null) {
					paramList.add(emp.getBloodtype());
				}


				count = dao.updateMypageDtos(paramList, emp.getUserId());
			}
			this.con.commit();
		} catch (Exception e) {
			e.printStackTrace();
			this.con.rollback();
			throw new Exception("登録できませんでした:" + e.getMessage());
		} finally {
			DBManager.closeConnection(this.con);
		}
		return count;
	}
}