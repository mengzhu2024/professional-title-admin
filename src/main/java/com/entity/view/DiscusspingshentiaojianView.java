package com.entity.view;

import com.entity.DiscusspingshentiaojianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;


/**
 * 评审条件评论表
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("discusspingshentiaojian")
public class DiscusspingshentiaojianView  extends DiscusspingshentiaojianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusspingshentiaojianView(){
	}

 	public DiscusspingshentiaojianView(DiscusspingshentiaojianEntity discusspingshentiaojianEntity){
 	try {
			BeanUtils.copyProperties(this, discusspingshentiaojianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
