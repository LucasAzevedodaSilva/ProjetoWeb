
package model;

public class User {
    //Atributos
    private String userName;
    private String userPass;
    private String userNick;
    
    //Construtor
    public User(String user,String pass){
      this.userName = user;
      this.userPass = pass;
    }
    
    //Getters & Setters
    public String getUserName(){
      return this.userName;
    }
    
    public void setUserName(String user){
      this.userName = user;
    }
    
    public String getUserPass(){
      return this.userName;
    }
    
    public void setUserPass(String user){
      this.userPass = user;
    }
    
    public String getUserNick(){
      return userNick;
    }
    
    public void setUserNick(String userNick){
      this.userName = userNick;
    }
    
    //toString = Representação e, formato String do Objeto
    @Override
    public String toString(){
      return"Nome: "+this.userName +"<br>Apelido: "+ this.userNick;
    }
    
    //Métodos gerais (regras de negócio)
    public boolean isLogged(){
      return (this.userName.equals("donini")&&
              this.userPass.equals("senha1234"));
    }
    
}
