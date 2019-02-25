/*
 * UpdateAction.java
 *   作成	IT-College	2016
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package controller;

import javax.servlet.annotation.WebServlet;

import controller.UpdateService.UPDATE_MODE;
import model.userDTO;
import page.base.BaseServlet;




/**
 * 入力された情報で、データベースの情報を更新します
 * @author IT-College
 *
 */
@WebServlet(name="update", urlPatterns={"/update"})
public class UpdateAction extends BaseServlet {



	protected String getPageName() {
		return "updateInput";
	}

	protected String doAction() throws Exception {
		// データを取得
		String[] pageParam = super.getInputParameter(
				 "empId"				// 0
				,"emppicId"				// 1
				,"empName"				// 2
				,"profile_basic_form_blood"// 3
				,"profile_basic_form_address"// 4
				,"profile_basic_form_income"				// 5
				,"profile_basic_form_height"				// 6
				,"profile_basic_form_habitus"				// 7
				,"profile_basic_form_education"				// 8
				,"profile_basic_form_job"				// 9
				,"profile_basic_form_holiday"				// 10
				,"profile_basic_form_smoking"				// 11
				,"profile_basic_form_want_children"				// 12
				,"empFree"				// 13
				);

//		SearchService sService = new SearchService();

		//情報をページに格納
		UpdateService Service= new UpdateService();
		userDTO emp = new userDTO();
		emp.setUserId(Integer.parseInt(pageParam[0]));
		emp.setPicId(Integer.parseInt(pageParam[1]));
		emp.setName(pageParam[2]);
		emp.setBloodtype(pageParam[3]);
		emp.setAge((pageParam[4]));
		emp.setIncome((pageParam[5]));
		emp.setHeight((pageParam[6]));
		emp.setBody(pageParam[7]);
		emp.setSchool(pageParam[8]);
		emp.setJob(pageParam[9]);
		emp.setHoliday(pageParam[10]);
		emp.setCigar(pageParam[11]);
		emp.setChild(pageParam[12]);
		emp.setFree(pageParam[13]);

		Service.registEmployee(emp, UPDATE_MODE.UPDATE);
		return "updateResult";
	}
}
