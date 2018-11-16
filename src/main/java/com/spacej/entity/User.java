package com.spacej.entity;

import java.io.Serializable;
import java.util.Date;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Table(name = "user")
public class User extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name = "id" ,type = MySqlTypeConstant.BIGINT , isKey = true)
	private int id;
    @Column(name = "username", type = MySqlTypeConstant.VARCHAR , length = 20, isNull = false)
	private String username;// 用户姓名
    @Column(name = "sex", type = MySqlTypeConstant.VARCHAR , length = 4, isNull = false)
	private String sex;// 性别
    @Column(name = "birthday", type = MySqlTypeConstant.DATETIME , isNull = false)
	private Date birthday;// 生日
    @Column(name = "address", type = MySqlTypeConstant.VARCHAR , length = 50, isNull = false)
	private String address;// 地址
	
	public User() {
		super();
	}
	
	public User(int id, String username, String sex, Date birthday, String address) {
		super();
		this.id = id;
		this.username = username;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
