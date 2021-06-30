package com.pj.jaxbbug;

// @Since 3.0

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Staff {

	@XmlAttribute
	int id;

	String name;

	String salary;

	String bio;
}

