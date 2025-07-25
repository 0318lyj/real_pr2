/* ============================================
  - 작성자   : 김어진
  - 최초작성 : 2025-06-19
  - 설명     : 근태 기록 CRUD용 Mybatis Mapper
  -----------------------------------------------
  [ 변경 이력 ]
  - 2025-06-19 (김어진): Mapper 생성
============================================ */
package com.eflix.hr.mapper;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import com.eflix.hr.dto.AttendanceRecordDTO;
import com.eflix.hr.dto.EmployeeDTO;

@Mapper
public interface AttendanceRecordMapper {

    // 근태 전체조회
    List<AttendanceRecordDTO> getAllRecords();

    // 근태 상세조회
    List<AttendanceRecordDTO> getRecordsByEmpId(AttendanceRecordDTO dto);
    
    // 로그인 사원 근태현황 년월 드롭다운
    List<LocalDate> getJoinDate(String empIdx, String coIdx);

    // 로그인 사원 근태현황 기본정보
    List<AttendanceRecordDTO> getBasicInfo(AttendanceRecordDTO dto);

    // 근태관리 조회
    List<AttendanceRecordDTO> managerSearch(AttendanceRecordDTO dto);

}
