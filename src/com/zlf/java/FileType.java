package com.zlf.java;

public enum FileType {
E1("E1","�ʼ���ϸ��"),
E2("E2","�����ʼ�ָ�����"),
E3("E3","���㼶�ʼ�ָ��"),
Q1("Q1","�̿�ͨ����"),
Q2("Q2","Ԥ��Ʒ����Ա"),
Q3("Q3","��Ӫ�ͻ������");

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



