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


import com.dao.ZhuhuDao;
import com.entity.ZhuhuEntity;
import com.service.ZhuhuService;
import com.entity.vo.ZhuhuVO;
import com.entity.view.ZhuhuView;

@Service("zhuhuService")
public class ZhuhuServiceImpl extends ServiceImpl<ZhuhuDao, ZhuhuEntity> implements ZhuhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuhuEntity> page = this.selectPage(
                new Query<ZhuhuEntity>(params).getPage(),
                new EntityWrapper<ZhuhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuhuEntity> wrapper) {
		  Page<ZhuhuView> page =new Query<ZhuhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuhuVO> selectListVO(Wrapper<ZhuhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuhuVO selectVO(Wrapper<ZhuhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuhuView> selectListView(Wrapper<ZhuhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuhuView selectView(Wrapper<ZhuhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
