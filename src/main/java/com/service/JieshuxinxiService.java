package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JieshuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JieshuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JieshuxinxiView;


/**
 * 借书信息
 *
 * @author 
 * @email 
 * @date 2022-03-26 16:12:18
 */
public interface JieshuxinxiService extends IService<JieshuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JieshuxinxiVO> selectListVO(Wrapper<JieshuxinxiEntity> wrapper);
   	
   	JieshuxinxiVO selectVO(@Param("ew") Wrapper<JieshuxinxiEntity> wrapper);
   	
   	List<JieshuxinxiView> selectListView(Wrapper<JieshuxinxiEntity> wrapper);
   	
   	JieshuxinxiView selectView(@Param("ew") Wrapper<JieshuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JieshuxinxiEntity> wrapper);
   	

}

