package egovframework.c.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.c.mapper.CMapper;
import egovframework.c.model.UserCDTO;
import egovframework.c.model.lisc001DTO;
import egovframework.c.model.lisc002DTO;
import egovframework.c.model.lisc003DTO;
import egovframework.c.service.CService;
import egovframework.d.model.lisq110DTO;
@Service("CService")

public class CServiseimpl implements CService{
	
	@Resource(name="CMapper")
	private CMapper cMapper;
	@Override
	public int joinUserC(UserCDTO dto) {
		return cMapper.joinUserC(dto);  // 매퍼에 조인 유저 확인 // 중복체크는 서비스에서
	}
	@Override
	public int userID(UserCDTO dto) {
		// TODO Auto-generated method stub
		return cMapper.userID(dto);
	}
	@Override
	public UserCDTO loginID(UserCDTO dto) {
		// TODO Auto-generated method stub
		return cMapper.loginID(dto);
	}
	@Override
	public List<lisc001DTO> lisc001list() {
		return cMapper.lisc001list();
	}
	@Override
	public List<lisc002DTO> lisc002list() {
		return cMapper.lisc002list();
	}
	@Override
	public List<lisc002DTO> codetype(String type) {
		return cMapper.codetype(type);
	}
	@Override
	public List<lisc003DTO> code(String type) {
		return cMapper.code(type);
	}
	@Override
	public List<lisc001DTO> searchval(String searchval) {
		return cMapper.searchval(searchval);
	}
	@Override
	public int addData(lisc002DTO dto) {
		return cMapper.addData(dto);
	}
	@Override
	public int update001Data(lisc001DTO dto) {
		return cMapper.update001Data(dto);
	}
	@Override
	public int update002Data(lisc002DTO dto) {
		return cMapper.update002Data(dto);
	}
	@Override
	public int update003Data(lisc003DTO dto) {
		return cMapper.update003Data(dto);
	}
}
