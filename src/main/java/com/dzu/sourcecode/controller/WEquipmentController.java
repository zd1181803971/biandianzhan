package com.dzu.sourcecode.controller;

import com.dzu.sourcecode.domain.WEquipment;
import com.dzu.sourcecode.service.IWEquipmentService;
import com.dzu.sourcecode.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Controller
 *
 * @author zhaodong
 * @date 2021-03-03
 */
@RestController
@RequestMapping("/equ")
public class WEquipmentController
{
    @Autowired
    private IWEquipmentService wEquipmentService;


    @GetMapping("/ssbmid/{sid}")
    public AjaxResult getEquBySSBM(@PathVariable("sid") String sid){
        List<WEquipment> equBySSBM = wEquipmentService.getEquBySSBM(sid);
        return AjaxResult.success(equBySSBM);
    }
    /**
     * 查询
     */
    @PostMapping("/list")
    public AjaxResult list(@RequestBody WEquipment wEquipment)
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
    public AjaxResult add(@RequestBody WEquipment wEquipment)
    {
        int subID = 0;
        List<WEquipment> wEquipments = wEquipmentService.selectWEquipmentList(new WEquipment());
        for (WEquipment we: wEquipments
             ) {
            if ( Integer.parseInt(we.getObjId()) > subID){
                subID = Integer.parseInt(we.getObjId());
            }
        }
        wEquipment.setObjId(String.valueOf(subID+1));
        wEquipment.setAzrq(new Date());
        int i = wEquipmentService.insertWEquipment(wEquipment);
        if (i>0){
            return AjaxResult.success();
        }else {
            return AjaxResult.error();
        }
    }

    /**
     * 修改
     */
    @PostMapping("/updateEqu")
    public AjaxResult edit(@RequestBody WEquipment wEquipment)
    {
        int i = wEquipmentService.updateWEquipment(wEquipment);
        if (i>0){
            return AjaxResult.success();
        }else {
            return AjaxResult.error();
        }
    }

    /**
     * 删除
     */
	@PostMapping("/delEqu/{objId}")
    public AjaxResult remove(@PathVariable String objId)
    {
        int i = wEquipmentService.deleteWEquipmentById(objId);
        if (i>0){
            return AjaxResult.success();
        }else {
            return AjaxResult.error();
        }
    }
}
