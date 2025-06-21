package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XueshengxuejiDao;
import com.entity.XueshengxuejiEntity;
import com.service.XueshengxuejiService;
import com.entity.vo.XueshengxuejiVO;
import com.entity.view.XueshengxuejiView;

@Service("xueshengxuejiService")
public class XueshengxuejiServiceImpl extends ServiceImpl<XueshengxuejiDao, XueshengxuejiEntity> implements XueshengxuejiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengxuejiEntity> page = this.selectPage(
                new Query<XueshengxuejiEntity>(params).getPage(),
                new EntityWrapper<XueshengxuejiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengxuejiEntity> wrapper) {
		  Page<XueshengxuejiView> page =new Query<XueshengxuejiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengxuejiVO> selectListVO(Wrapper<XueshengxuejiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengxuejiVO selectVO(Wrapper<XueshengxuejiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengxuejiView> selectListView(Wrapper<XueshengxuejiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengxuejiView selectView(Wrapper<XueshengxuejiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
