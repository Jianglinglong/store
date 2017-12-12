package com.team.store.controller.coupon;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team.store.po.CouponInfo;
import com.team.store.po.Packet;
import com.team.store.po.UserInfo;
import com.team.store.service.person.CouponService;
import com.team.store.service.person.UserPacketService;

@Controller
@RequestMapping("coupon")
public class CouponController {
	// 优惠卷
	@Resource(name = "couponService")
	private CouponService couponService;
	// 红包
	@Resource(name = "packetService")
	private UserPacketService userPacketService;

	@RequestMapping("useCoupon")
	public @ResponseBody Map<String, Object> useCoupon(int couponId, HttpSession session) {
		UserInfo user = (UserInfo) session.getAttribute("user");
		Map<String, Object> map = new HashMap<String, Object>();
		Double yhjprice = 0.0;
		Integer condition = 0;
		if (couponId != -1) {
			CouponInfo coupon = couponService.getCoupon(user, couponId);
			yhjprice = coupon.getCouponPrice();
			condition = coupon.getCouponCondition();
		}
		map.put("couponPrice", yhjprice);
		map.put("condition", condition);

		return map;
	}

	@RequestMapping("updateCoupon")
	public void updateCoupon(int couponId, double couponPrice, HttpSession session) {
		UserInfo user = (UserInfo) session.getAttribute("user");

		if (couponPrice != 0.0) {
			couponService.userCoupon(user, couponId);
		} else {
			couponService.deleteCoupon(user, couponId);
		}

	}

	@RequestMapping("usePacket")
	public @ResponseBody Map<String, Object> usePacket(int packetId, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		Double packetprice = 0.0;
		if (packetId != -1) {
			Packet packet = userPacketService.getPacketById(packetId);
			packetprice = packet.getPacketRemainMoney();
		}
		map.put("packetprice", packetprice);

		return map;
	}

	@RequestMapping("updatePacket")
	public void updatePacket(int packetId, double packetPrice, HttpSession session) {

		if (packetPrice != 0.0) {
			userPacketService.usePacket(packetId, packetPrice);
		}

	}
}
