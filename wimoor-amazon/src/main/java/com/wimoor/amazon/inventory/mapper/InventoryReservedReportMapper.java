package com.wimoor.amazon.inventory.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.inventory.pojo.entity.InventoryReservedReport;

/**
 * <p>
 * 亚马逊报表类型 Mapper 接口
 * </p>
 *
 * @author wimoor team
 * @since 2022-05-12
 */
@Mapper
public interface InventoryReservedReportMapper extends BaseMapper<InventoryReservedReport> {

}
