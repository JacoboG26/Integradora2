package model;
public class Enemy{
  private String name;
  private Double damageScore;
  private Double rewardScore;
  private String typeStr;
  private int xPosition;
  private int yPosition;

  public Enemy(String name, Double damageScore, Double rewardScore, String typeStr, int xposition, int yPosition){
    this.name = name;
    this.damageScore = damageScore;
    this.rewardScore = rewardScore;
    this.typeStr = typeStr;
    this.xPosition = xPosition;
    this.yPosition = yPosition;
  }

  
}