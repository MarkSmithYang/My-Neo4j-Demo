package com.yb.demo.neo4j.service;

import java.util.List;

import com.yb.demo.neo4j.model.Card;
import com.yb.demo.neo4j.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Neo4jService {

	@Autowired
	private CardRepository cardRepository;
	// @Autowired
	// private Neo4jTemplate neo4jTemplate;//过时的方法

	/**
	 * @throws @Description:通过number编号查询数据
	 * @param number
	 * @return
	 */
	public Card findByNumber(String number) {
		List<Card> results = cardRepository.findList();
		Card result1 = cardRepository.findByNum(number);
		Card result = cardRepository.findByNumber(number);
		return result;
	}

}
