package ClassComparable;

public class Customer implements Comparable {

private Integer cusid;
private String cusName;
private Integer salary;
    Customer(Integer cusid,String cusName,Integer salary)
    {
    	this.cusid=cusid;
    	this.cusName=cusName;
    	this.salary=salary;
    }

public Integer getCusid() {
	return cusid;
}
public void setCusid(Integer cusid) {
	this.cusid = cusid;
}
public String getCusName() {
	return cusName;
}
public void setCusName(String cusName) {
	this.cusName = cusName;
}
public Integer getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}

@Override
public int compareTo(Object o) {
	Customer s=(Customer) o;
	int idCompare=this.cusid.compareTo(cusid);
	return idCompare;
}

public String toString()
{
	return "Customer Details:AccNo:"+cusid+"Customer Name:"+cusName+" CustomerSalary"+salary;
}


}
