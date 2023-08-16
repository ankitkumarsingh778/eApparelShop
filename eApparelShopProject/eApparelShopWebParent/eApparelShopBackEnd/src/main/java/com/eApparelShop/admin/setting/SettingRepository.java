package com.eApparelShop.admin.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.eApparelShop.common.entity.setting.Setting;
import com.eApparelShop.common.entity.setting.SettingCategory;

public interface SettingRepository extends CrudRepository<Setting, String> {
	public List<Setting> findByCategory(SettingCategory category);
}
