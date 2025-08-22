package model;

class qpojo {

	private int qno;
	private String question;
	private String op1;
	private String op2;
	private String op3;
	private String op4;
	private String answer;
	

public qpojo(int qno, String question, String op1, String op2, String op3, String op4) {

	this.qno = qno;
	this.question = question;
	this.op1 = op1;
	this.op2 = op2;
	this.op3 = op3;
	this.op4 = op4;
}

public qpojo(int qno, String question, String op1, String op2, String op3, String op4, String answer) {
	super();
	this.qno = qno;
	this.question = question;
	this.op1 = op1;
	this.op2 = op2;
	this.op3 = op3;
	this.op4 = op4;
	this.answer = answer;
}





public qpojo(int qno, String answer) {
	super();
	this.qno = qno;
	this.answer = answer;
}

public int getQno() {
	return qno;
}



public void setQno(int qno) {
	this.qno = qno;
}



public String getQuestion() {
	return question;
}



public void setQuestion(String question) {
	question = question;
}



public String getOp1() {
	return op1;
}



public void setOp1(String op1) {
	this.op1 = op1;
}



public String getOp2() {
	return op2;
}



public void setOp2(String op2) {
	this.op2 = op2;
}



public String getOp3() {
	return op3;
}



public void setOp3(String op3) {
	this.op3 = op3;
}



public String getOp4() {
	return op4;
}



public void setOp4(String op4) {
	this.op4 = op4;
}



public String getAnswer() {
	return answer;
}



public void setAnswer(String answer) {
	this.answer = answer;
}




}
