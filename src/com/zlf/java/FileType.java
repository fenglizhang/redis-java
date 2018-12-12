package com.zlf.java;

public enum FileType {
E1("E1","质检明细表"),
E2("E2","初次质检指标汇总"),
E3("E3","各层级质检指标"),
Q1("Q1","绿卡通报表"),
Q2("Q2","预警品优人员"),
Q3("Q3","经营客户池配额");

private final String type;
private final String name;

private FileType(String type,String name){
	this.type=type;
	this.name=name;
}

public String type(){
	return this.type;
}

public static FileType typeOf(String type){
	FileType [] fileTypes=FileType.values();
	for (FileType fileType : fileTypes) {
		if(fileType.equals(type)){
			return fileType;
		}
	}
	
return null;

}

public String labelOf(String type){
	if(typeOf(type)!=null){
		return typeOf(type).name;
	}
	return null;
}





}



