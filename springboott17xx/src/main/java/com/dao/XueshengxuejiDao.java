package com.dao;

import com.entity.XueshengxuejiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengxuejiVO;
import com.entity.view.XueshengxuejiView;


/**
 * 学生学籍
 * 
 * @author 
 * @email 
 * @date 2023-02-15 10:46:44
 */
public interface XueshengxuejiDao extends BaseMapper<XueshengxuejiEntity> {
	
	List<XueshengxuejiVO> selectListVO(@Param("ew") Wrapper<XueshengxuejiEntity> wrapper);
	
	XueshengxuejiVO selectVO(@Param("ew") Wrapper<XueshengxuejiEntity> wrapper);
	
	List<XueshengxuejiView> selectListView(@Param("ew") Wrapper<XueshengxuejiEntity> wrapper);

	List<XueshengxuejiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengxuejiEntity> wrapper);
	
	XueshengxuejiView selectView(@Param("ew") Wrapper<XueshengxuejiEntity> wrapper);
	

}
