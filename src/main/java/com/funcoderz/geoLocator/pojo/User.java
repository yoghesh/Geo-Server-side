package com.funcoderz.geoLocator.pojo;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="user")
public class User {

	private int m_id;
	public int getM_id() {
		return m_id;
	}
	@XmlElement
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	@XmlElement
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_mail() {
		return m_mail;
	}
	@XmlElement
	public void setM_mail(String m_mail) {
		this.m_mail = m_mail;
	}
	public String getM_key() {
		return m_key;
	}
	@XmlElement
	public void setM_key(String m_key) {
		this.m_key = m_key;
	}
	public String getM_password() {
		return m_password;
	}
	@XmlElement
	public void setM_password(String m_password) {
		this.m_password = m_password;
	}
	private String m_name;
	private String m_mail;
	private String m_key;
	private String m_password;

	public void createDummy()
	{
		m_id = 1;
		m_key = "sekurfhseurh";
		m_mail="mymail";
		m_name="my name";
		m_password="no pass";
	}


}
