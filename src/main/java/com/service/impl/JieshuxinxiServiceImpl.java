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


import com.dao.JieshuxinxiDao;
import com.entity.JieshuxinxiEntity;
import com.service.JieshuxinxiService;
import com.entity.vo.JieshuxinxiVO;
import com.entity.view.JieshuxinxiView;

@Service("jieshuxinxiService")
public class JieshuxinxiServiceImpl extends ServiceImpl<JieshuxinxiDao, JieshuxinxiEntity> implements JieshuxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JieshuxinxiEntity> page = this.selectPage(
                new Query<JieshuxinxiEntity>(params).getPage(),
                new EntityWrapper<JieshuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JieshuxinxiEntity> wrapper) {
		  Page<JieshuxinxiView> page =new Query<JieshuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JieshuxinxiVO> selectListVO(Wrapper<JieshuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JieshuxinxiVO selectVO(Wrapper<JieshuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JieshuxinxiView> selectListView(Wrapper<JieshuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JieshuxinxiView selectView(Wrapper<JieshuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
