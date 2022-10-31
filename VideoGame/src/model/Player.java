package model;
public class Player{
  private String name;
  private String nickname;
  private Double score;
  private Double lifes;

  public Player(String name, String nickname){
  this.name = name;
  this.nickname = nickname;
  this.score = 10;
  this.lifes = 5;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getNickname(){
    return nickname;
  }

  public void setNickname(String nickname){
    this.nickname;
  }

  public Double getScore(){
    return score;
  }

  public void setScore(Double score){
    this.score;
  }

  public Double getLifes(){
    return lifes;
  }

  public void setLifes(Double lifes){
    this.lifes
  }
}
                                              
