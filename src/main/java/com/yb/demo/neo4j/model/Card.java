package com.yb.demo.neo4j.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * GraphRepository在Boot2.0下不支持了，调整为Neo4jRepository。
 * 对应的findById和deleteById也要调整。
 * @GraphId也不支持需要改成@Id @GeneratedValue 。
 */
@Getter
@Setter
@NoArgsConstructor//无参构造
@AllArgsConstructor//全参构造
@NodeEntity//表明该类是一个Neo4j支持的节点实体类
@ApiModel("Neo4j的Demo实体")
public class Card {

	@Id
	@GeneratedValue
	private Long id;
	private Long ccv;
	private String number;
	private String date;
	
}
