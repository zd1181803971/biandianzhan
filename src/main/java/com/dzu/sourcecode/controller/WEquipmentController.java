package com.dzu.sourcecode.controller;

import com.dzu.sourcecode.domain.WEquipment;
import com.dzu.sourcecode.service.IWEquipmentService;
import com.dzu.sourcecode.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller
 *
 * @author zhaodong
 * @date 2021-03-03
 */
@RestController
@RequestMapping("/system")
public class WEquipmentController
{
    @Autowired
    private IWEquipmentService wEquipmentService;


    /**
     * 查询【请填写功能名称】列表
     */
    @GetMapping("/list")
    public AjaxResult list(WEquipment wEquipment)
    {
        List<WEquipment> wEquipments = wEquipmentService.selectWEquipmentList(wEquipment);
        return AjaxResult.success(wEquipments);
    }


    /**
     * 获取
     */
    @GetMapping(value = "/{objId}")
    public AjaxResult getInfo(@PathVariable("objId") String objId)
    {
        return AjaxResult.success(wEquipmentService.selectWEquipmentById(objId));
    }

    /**
     * 新增
     */
    @PostMapping
    public void add(@RequestBody WEquipment wEquipment)
    {
         wEquipmentService.insertWEquipment(wEquipment);
    }

    /**
     * 修改
     */
    @PutMapping
    public void edit(@RequestBody WEquipment wEquipment)
    {
         wEquipmentService.updateWEquipment(wEquipment);
    }

    /**
     * 删除【
     */
	@DeleteMapping("/{objIds}")
    public void remove(@PathVariable String[] objIds)
    {
         wEquipmentService.deleteWEquipmentByIds(objIds);
    }
}
