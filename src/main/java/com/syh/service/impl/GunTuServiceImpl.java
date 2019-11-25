package com.syh.service.impl;

import com.syh.bean.GunTu;
import com.syh.dao.GunTuDao;
import com.syh.service.GunTuService;

import java.util.List;

public class GunTuServiceImpl implements GunTuService {
	private GunTuDao gunTuDao;
	
	public GunTuDao getGunTuDao() {
		return gunTuDao;
	}
	public void setGunTuDao(GunTuDao gunTuDao) {
		this.gunTuDao = gunTuDao;
	}
	@Override
	public int insert(GunTu gunTu) {
		System.out.println(gunTuDao);
		return gunTuDao.insert(gunTu);
	}
	@Override
	public int delete(Integer id) {
		return gunTuDao.delete(id);
	}
	@Override
	public int update(GunTu gunTu) {
		return gunTuDao.update(gunTu);
	}
	@Override
	public List<GunTu> selectAll() {
		return gunTuDao.selectAll();
	}
	@Override
	public GunTu selectById(Integer id) {
		return gunTuDao.selectById(id);
	}

}
