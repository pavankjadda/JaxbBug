package com.pj.jaxbbug;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.util.List;

@XmlRootElement
@XmlType(propOrder = {"name", "list"})
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Company {

	@XmlElement(name = "staff")
	List<Staff> list;

	String name;
}
