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


import com.dao.WeixiufenleiDao;
import com.entity.WeixiufenleiEntity;
import com.service.WeixiufenleiService;
import com.entity.vo.WeixiufenleiVO;
import com.entity.view.WeixiufenleiView;

@Service("weixiufenleiService")
public class WeixiufenleiServiceImpl extends ServiceImpl<WeixiufenleiDao, WeixiufenleiEntity> implements WeixiufenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiufenleiEntity> page = this.selectPage(
                new Query<WeixiufenleiEntity>(params).getPage(),
                new EntityWrapper<WeixiufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiufenleiEntity> wrapper) {
		  Page<WeixiufenleiView> page =new Query<WeixiufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiufenleiVO> selectListVO(Wrapper<WeixiufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiufenleiVO selectVO(Wrapper<WeixiufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiufenleiView> selectListView(Wrapper<WeixiufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiufenleiView selectView(Wrapper<WeixiufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
