package com.trabalho;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class JSONWrite {

	@SuppressWarnings("unchecked") public static void main(String[] args) {
		
		JSONObject jsonObject = new JSONObject(); 
		
		FileWriter writeFile = null; 
		
		jsonObject.put("nome", "Gabriela"); 
		jsonObject.put("sobrenome", "Justino"); 
		jsonObject.put("pais", "Brasil"); 
		jsonObject.put("estado", "SP"); 
		
		try{ writeFile = new FileWriter("saida.json"); 
			writeFile.write(jsonObject.toJSONString()); 
			writeFile.close(); 
		} catch(IOException e){ 
			e.printStackTrace(); 
		} 

		System.out.println(jsonObject); 
		}
	}
