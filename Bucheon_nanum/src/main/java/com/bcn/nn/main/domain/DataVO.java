package com.bcn.nn.main.domain;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

/*
create table t_table(
dataNo int primary key auto_increment,
testString char(200) not null
);
*/
public class DataVO {

	private int dataNo; //PK AI
	private String testString;

}
