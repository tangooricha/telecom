package cn.com.telecom.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.com.telecom.domain.InformationOfTerminal;

@Repository
public interface InformationOfTerminalRepository extends CrudRepository<InformationOfTerminal, Integer>{
	
	List<InformationOfTerminal> findAll();
	
	InformationOfTerminal findById(int id);
	
}
