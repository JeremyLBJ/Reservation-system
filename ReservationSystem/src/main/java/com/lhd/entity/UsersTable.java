package com.lhd.entity;

public class UsersTable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_table.id
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_table.username
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_table.password
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_table.userAvatar
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private String useravatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_table.email
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_table.sex
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_table.tel
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private String tel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_table.id
     *
     * @return the value of users_table.id
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_table.id
     *
     * @param id the value for users_table.id
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_table.username
     *
     * @return the value of users_table.username
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_table.username
     *
     * @param username the value for users_table.username
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_table.password
     *
     * @return the value of users_table.password
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_table.password
     *
     * @param password the value for users_table.password
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_table.userAvatar
     *
     * @return the value of users_table.userAvatar
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public String getUseravatar() {
        return useravatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_table.userAvatar
     *
     * @param useravatar the value for users_table.userAvatar
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setUseravatar(String useravatar) {
        this.useravatar = useravatar == null ? null : useravatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_table.email
     *
     * @return the value of users_table.email
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_table.email
     *
     * @param email the value for users_table.email
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_table.sex
     *
     * @return the value of users_table.sex
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_table.sex
     *
     * @param sex the value for users_table.sex
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_table.tel
     *
     * @return the value of users_table.tel
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_table.tel
     *
     * @param tel the value for users_table.tel
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

	@Override
	public String toString() {
		return "UsersTable [id=" + id + ", username=" + username + ", password=" + password + ", useravatar="
				+ useravatar + ", email=" + email + ", sex=" + sex + ", tel=" + tel + "]";
	}
    
}