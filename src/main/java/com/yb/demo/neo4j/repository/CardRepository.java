package com.yb.demo.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.yb.demo.neo4j.model.Card;

/**
 * GraphRepository在Boot2.0下不支持了，调整为Neo4jRepository。
 * 对应的findById和deleteById也要调整。
 * @GraphId也不支持需要改成@Id @GeneratedValue 。
 */
public interface CardRepository extends Neo4jRepository<Card,Long> {
//public interface CardRepository extends GraphRepository<Card>{

	@Query("MATCH (n:Card) WHERE n.number = { num}  with n match p=(n)-[]-(m) return p,ID(n)")
	public Card findByNum( @Param("num") String number);
	
	public Card findByNumber( String number);

	@Query(" MATCH p=(n)-[o:DD]->(m) return n ")
	public List<Card> findList();

}
