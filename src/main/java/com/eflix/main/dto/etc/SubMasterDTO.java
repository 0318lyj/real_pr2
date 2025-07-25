package com.eflix.main.dto.etc;

import com.eflix.main.dto.MasterDTO;
import com.eflix.main.dto.SubscriptionDTO;

import lombok.Data;

/**
 * ERP 구독 정보(subscription, master)를 전송하기 위한 DTO 클래스
 * 
 * @author 복성민 (bokseongmin@gmail.com)
 * @version 1.0
 * @since 2025-06-26
 * 
 * @see com.eflix.main.controller.SubscriptionRestController
 * 
 * @changelog
 * <ul>
 *   <li>2025-06-26: 최초 생성 (복성민)</li>
 * </ul>
 */

@Data
public class SubMasterDTO {
    private SubscriptionDTO subscriptionDTO;
    private MasterDTO masterDTO;
}
