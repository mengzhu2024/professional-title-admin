package com.entity.view;

import com.entity.PingshentiaojianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;


/**
 * 评审条件
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("pingshentiaojian")
public class PingshentiaojianView  extends PingshentiaojianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PingshentiaojianView(){
	}

 	public PingshentiaojianView(PingshentiaojianEntity pingshentiaojianEntity){
 	try {
			BeanUtils.copyProperties(this, pingshentiaojianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
