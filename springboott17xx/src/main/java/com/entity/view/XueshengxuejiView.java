package com.entity.view;

import com.entity.XueshengxuejiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生学籍
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-15 10:46:44
 */
@TableName("xueshengxueji")
public class XueshengxuejiView  extends XueshengxuejiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengxuejiView(){
	}
 
 	public XueshengxuejiView(XueshengxuejiEntity xueshengxuejiEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengxuejiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
