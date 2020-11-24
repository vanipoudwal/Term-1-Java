
package qwe;

public class Qwe extends myclass {

    public static void main(String[] args) {
     
        Qwe obj=new Qwe();
        obj.name(12);
        obj.setName("Alok");
        obj.setAddress("delhi");
        obj.setOrg("niit");
        System.out.println("My name is"+ obj.getName());
        System.out.println("My address is"+ obj.getAddress());
        System.out.println("My org name is"+ obj.getOrg());
        //obj.name1();
    }
    
    @Override
    public void name(int a){
    //throw new UnsupportedOperationException("Not suported yet.");
    }
    
    @Override
    public void setName(String name){
    super.name = name;
    }
    
    @Override
    public String getName(){
    return super.name;   
    }
    
    @Override
    public void setAddress(String address){
    super.address = address;
    }
    
    @Override
    public String getAddress(){
    return super.address;
    }
    
    @Override
    public void setOrg(String org){
    super.org = org;
    }
    
    @Override
    public String getOrg(){
    return null;
    }
}