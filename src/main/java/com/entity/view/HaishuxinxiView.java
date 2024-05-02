package com.entity.view;

import com.entity.HaishuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 还书信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 16:12:18
 */
@TableName("haishuxinxi")
public class HaishuxinxiView  extends HaishuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HaishuxinxiView(){
	}
 
 	public HaishuxinxiView(HaishuxinxiEntity haishuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, haishuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
