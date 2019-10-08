package com.cskaoyan.mall.controller.admincontroller.controllerZYP;

import com.cskaoyan.mall.bean.BaseRespVo;
import com.cskaoyan.mall.bean.Topic;
import com.cskaoyan.mall.exception.ExtensionCouponDiscountException;
import com.cskaoyan.mall.service.adminservice.ExtensionTopicService;
import com.cskaoyan.mall.vo.adminvo.extensionvo.FromRequestKey;
import com.cskaoyan.mall.vo.adminvo.extensionvo.TopicNotKnow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/topic")
public class ExtensionTopicController {
    @Autowired
    ExtensionTopicService extensionTopicService;

    @RequestMapping("list")
    public BaseRespVo topicList(FromRequestKey fromRequestKey,String title,String subtitle) {
        BaseRespVo baseRespVo = extensionTopicService.queryCoupon(fromRequestKey,title,subtitle);
        return baseRespVo;
    }

    @RequestMapping("create")
    public BaseRespVo topicCreate(@RequestBody TopicNotKnow topicNotKnow) throws ExtensionCouponDiscountException {
        BaseRespVo baseRespVo = extensionTopicService.topicCreate(topicNotKnow);
        return baseRespVo;
    }

    @RequestMapping("update")
    public BaseRespVo topicUpdate(@RequestBody TopicNotKnow topicNotKnow) throws ExtensionCouponDiscountException {
        BaseRespVo baseRespVo = extensionTopicService.topicUpdate(topicNotKnow);
        return baseRespVo;
    }

    @RequestMapping("delete")
    public BaseRespVo topicDelete(@RequestBody Topic topic) {
        BaseRespVo baseRespVo = extensionTopicService.topicDelete(topic);
        return baseRespVo;
    }

}
