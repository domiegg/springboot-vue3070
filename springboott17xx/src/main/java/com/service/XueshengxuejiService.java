package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengxuejiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengxuejiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengxuejiView;


/**
 * 学生学籍
 *
 * @author 
 * @email 
 * @date 2023-02-15 10:46:44
 */
public interface XueshengxuejiService extends IService<XueshengxuejiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengxuejiVO> selectListVO(Wrapper<XueshengxuejiEntity> wrapper);
   	
   	XueshengxuejiVO selectVO(@Param("ew") Wrapper<XueshengxuejiEntity> wrapper);
   	
   	List<XueshengxuejiView> selectListView(Wrapper<XueshengxuejiEntity> wrapper);
   	
   	XueshengxuejiView selectView(@Param("ew") Wrapper<XueshengxuejiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengxuejiEntity> wrapper);
   	

}

