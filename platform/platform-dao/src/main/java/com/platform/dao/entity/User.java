/* https://github.com/orange1438 */
package com.platform.dao.entity;

import java.io.Serializable;

/** 
 * @author houxingfen
 * date:2019/04/12 15:43
 */
public class User implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 2526536178424908959L;

    private Integer id;

    private String username;

    private String password;

    private Integer age;

    /** 
     * 获取 user.id
     * @return user.id
     */
    public final Integer getId() {
        return id;
    }

    /** 
     * 设置 user.id
     * @param id user.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /** 
     * 获取 user.username
     * @return user.username
     */
    public final String getUsername() {
        return username;
    }

    /** 
     * 设置 user.username
     * @param username user.username
     */
    public final void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /** 
     * 获取 user.password
     * @return user.password
     */
    public final String getPassword() {
        return password;
    }

    /** 
     * 设置 user.password
     * @param password user.password
     */
    public final void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /** 
     * 获取 user.age
     * @return user.age
     */
    public final Integer getAge() {
        return age;
    }

    /** 
     * 设置 user.age
     * @param age user.age
     */
    public final void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", age=").append(age);
        sb.append("]");
        return sb.toString();
    }
}