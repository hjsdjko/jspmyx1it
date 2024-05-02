package com.dao;

import com.entity.JieshuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JieshuxinxiVO;
import com.entity.view.JieshuxinxiView;


/**
 * 借书信息
 * 
 * @author 
 * @email 
 * @date 2022-03-26 16:12:18
 */
public interface JieshuxinxiDao extends BaseMapper<JieshuxinxiEntity> {
	
	List<JieshuxinxiVO> selectListVO(@Param("ew") Wrapper<JieshuxinxiEntity> wrapper);
	
	JieshuxinxiVO selectVO(@Param("ew") Wrapper<JieshuxinxiEntity> wrapper);
	
	List<JieshuxinxiView> selectListView(@Param("ew") Wrapper<JieshuxinxiEntity> wrapper);

	List<JieshuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JieshuxinxiEntity> wrapper);
	
	JieshuxinxiView selectView(@Param("ew") Wrapper<JieshuxinxiEntity> wrapper);
	

}
