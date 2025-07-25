package com.eflix.common.payment.service;

import com.eflix.common.payment.Entity.PaymentEntity;
import com.eflix.common.payment.dto.SubscriptionPaymentDTO;
import com.eflix.main.dto.SubscriptionDTO;
import com.eflix.main.dto.SubscriptionPackageDetailDTO;

/**
 * 결제 처리를 담당하는 서비스
 * 
 * <p>
 * </p>
 * 
* <h3>주요 기능</h3>
 * <ul>
 *   <li>상품 조회</li>
 * </ul>
 * 
 * @author 복성민 (bokseongmin@gmail.com)
 * @version 1.0
 * @since 2025-06-19
 * 
 * @see
 * 
 * @changelog
 * <ul>
 *   <li>2025-06-19: 최초 생성 (복성민)</li>
 *   <li>2025-06-20: 결제 코드 추가 (복성민)</li>
 * </ul>
 */

public interface PaymentService {
    
    public PaymentEntity getPaymentById(String paymentIdx);

    public int insertPayment(PaymentEntity paymentEntity);

    public int updatePayment(PaymentEntity paymentEntity);

    // 0704
    public void processSubscription();
    
    public String requestPayment(SubscriptionPaymentDTO dto, String accessToken);
}
