package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author wl_sun
 * @description TODO
 * @create Date
 */
public interface SectionMapper {
    /**
     * 根据专题id查询标签列表
     *
     * @param specialId
     * @return List<Section>
     */
    @Select("SELECT *FROM t_section WHERE special_id = #{specialId} ")
    List<Section> getSectionsBySpecialId(String specialId);
}