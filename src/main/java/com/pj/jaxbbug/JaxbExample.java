package com.pj.jaxbbug;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.util.Arrays;

public class JaxbExample
{
	public static void main(String[] args)
	{
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Company.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(createCompanyObject(), System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private static Company createCompanyObject() {

		Company comp = new Company();
		comp.setName("ABCDEFG Enterprise");

		Staff o1 = new Staff();
		o1.setId(1);
		o1.setName("mkyong");
		o1.setSalary("8000 & Bonus");
		o1.setBio("<h1>support</h1>");

		Staff o2 = new Staff();
		o2.setId(2);
		o2.setName("yflow");
		o2.setSalary("9000");
		o2.setBio("<h1>developer & database</h1>");

		comp.setList(Arrays.asList(o1, o2));

		return comp;
	}

}
