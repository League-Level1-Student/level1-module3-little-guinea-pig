void setup(){
  size(500,500);
}
int x_pos = 250;
int y_pos = 250;
int birdYVelocity = 30;
int gravity = 1;
int rect_x_pos = 470;
int upperPipeHeight = (int) random(100, 400);
int lowerPipeHeight = (int) random(100, 400);
int pipeGap = 100;
int upperY = 0;
int lowerY = 300;
int score = 0;
void draw(){
  background(#00FFFD);
  fill(#FEFF00);
  stroke(#FEFF00);
  ellipse(x_pos,y_pos,25,25);
  fill(#03FF00);
  stroke(0,0,0);
  rect(rect_x_pos,0,30,upperPipeHeight);
  lowerY = upperY + upperPipeHeight + pipeGap;
  rect(rect_x_pos,lowerY,30,500);
  y_pos += gravity;
  rect_x_pos -= 2;
  teleport_pipe();
}
void mousePressed(){
  y_pos -= birdYVelocity;
}
void teleport_pipe(){
  if(rect_x_pos < -20){
    rect_x_pos = 470;
    fill(#03FF00);
    stroke(0,0,0);
        if(intersectsPipes() == false){
      score++;
    text(score, 250,50);
  }
else{
  text(score + "Game over", 250,50);
  System.exit(0);
}
    upperPipeHeight = (int) random(100, 400);
    lowerPipeHeight = (int) random(100, 400);
    rect(rect_x_pos,0,30,upperPipeHeight);
    rect(rect_x_pos,lowerY,30,500);
}
}
boolean intersectsPipes() { 
     if (y_pos < upperPipeHeight && x_pos > rect_x_pos && x_pos < (rect_x_pos+30)){
          return true; }
     else if (y_pos>lowerY && x_pos >rect_x_pos && x_pos< (rect_x_pos+30)) {
          return true; }
     else { return false; }
}