package com.syh.service;

import com.syh.bean.GunTu;

import java.util.List;

public interface GunTuService {
	int insert(GunTu gunTu);
	int delete(Integer id);
	int update(GunTu gunTu);
	List<GunTu> selectAll();
	GunTu selectById(Integer id);
}
