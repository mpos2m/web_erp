package web_erp.service;

import java.sql.Connection;
import java.util.List;

import web_erp.ds.JndiDS;
import web_erp.dto.Title;
import web_erp.impl.TitleDaoImpl;

public class TitleService {
	private Connection con = JndiDS.getConnection();
	private TitleDaoImpl dao = TitleDaoImpl.getInstance();
	
	public TitleService() {
		dao.setCon(con);
	}
	
	public List<Title> showTitles(){
		return dao.selectTitleByAll();
	}
	
	public void addTitle(Title title) {
		dao.insertTitle(title);
	}
	
	public Title showTitle(Title title) {
		return dao.selectTitleByNo(title);
	}
	
	public void delTitle(int TitleNo) {
		dao.deleteTitle(8);
	}
}
