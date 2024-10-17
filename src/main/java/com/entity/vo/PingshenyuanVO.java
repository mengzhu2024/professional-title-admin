package com.entity.vo;

import com.entity.PingshenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;


/**
 * 评审员
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
public class PingshenyuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 密码
	 */

	private String mima;

	/**
	 * 评审员姓名
	 */

	private String pingshenyuanxingming;

	/**
	 * 性别
	 */

	private String xingbie;

	/**
	 * 照片
	 */

	private String zhaopian;

	/**
	 * 手机
	 */

	private String shouji;

	/**
	 * 身份证
	 */

	private String shenfenzheng;


	/**
	 * 设置：密码
	 */

	public void setMima(String mima) {
		this.mima = mima;
	}

	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}


	/**
	 * 设置：评审员姓名
	 */

	public void setPingshenyuanxingming(String pingshenyuanxingming) {
		this.pingshenyuanxingming = pingshenyuanxingming;
	}

	/**
	 * 获取：评审员姓名
	 */
	public String getPingshenyuanxingming() {
		return pingshenyuanxingming;
	}


	/**
	 * 设置：性别
	 */

	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}

	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}


	/**
	 * 设置：照片
	 */

	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}

	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}


	/**
	 * 设置：手机
	 */

	public void setShouji(String shouji) {
		this.shouji = shouji;
	}

	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}


	/**
	 * 设置：身份证
	 */

	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}

	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}

}
