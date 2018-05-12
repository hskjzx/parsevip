package com.pibigstar.system.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SystemUser {
	
	@GeneratedValue
	@Id
    private Long id;

	@Column(nullable=false,unique=true)
    private String username;

	@Column(nullable=false)
    private String email;
	@Column(nullable=true)
    private String phone;
	@Column(nullable=false)
    private String password;
	@Column(nullable=true)
    private Integer age;
	@Column(nullable=true)
    private String signature;
	@Column(nullable=true)
    private String sex;
	@Column(nullable=true)
    private Date createTime;
	@Column(nullable=true)
    private Date updateTime;
	@Column(nullable=true)
    private String state;
	@Column(nullable=true)
    private String emailCode;
	@Column(nullable=true)
    private String lastIp;
	@Column(nullable=true)
    private Date lastTime;
	@Column(nullable=true)
    private String lastAddress;
	
    
  //roleSet记得跟UserMapping里面表关联时字段名字相对应
  	//private Set<Role> roleSet = new HashSet<Role>();
	
	
	
	public String getUsername() {
		return username;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmailCode() {
		return emailCode;
	}
	public void setEmailCode(String emailCode) {
		this.emailCode = emailCode;
	}
	public String getLastIp() {
		return lastIp;
	}
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}
	public Date getLastTime() {
		return lastTime;
	}
	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}
	public String getLastAddress() {
		return lastAddress;
	}
	public void setLastAddress(String lastAddress) {
		this.lastAddress = lastAddress;
	}

}