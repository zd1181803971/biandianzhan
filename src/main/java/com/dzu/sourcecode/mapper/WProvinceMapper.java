package com.dzu.sourcecode.mapper;


import com.dzu.sourcecode.domain.WProvince;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author zhaodong
 * @date 2021-03-03
 */
@Mapper
public interface WProvinceMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param proid 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public WProvince selectWProvinceById(String proid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param wProvince 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<WProvince> selectWProvinceList(WProvince wProvince);

    /**
     * 新增【请填写功能名称】
     *
     * @param wProvince 【请填写功能名称】
     * @return 结果
     */
    public int insertWProvince(WProvince wProvince);

    /**
     * 修改【请填写功能名称】
     *
     * @param wProvince 【请填写功能名称】
     * @return 结果
     */
    public int updateWProvince(WProvince wProvince);

    /**
     * 删除【请填写功能名称】
     *
     * @param proid 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteWProvinceById(String proid);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param proids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWProvinceByIds(String[] proids);
}
