package com.entity.view;

import com.entity.ZhichengshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;


/**
 * 职称申请
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhichengshenqing")
public class ZhichengshenqingView  extends ZhichengshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhichengshenqingView(){
	}

 	public ZhichengshenqingView(ZhichengshenqingEntity zhichengshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, zhichengshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
