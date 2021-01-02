import java.lang.Math;

public class Body {

  // instance variables
  public double xxPos;
  public double yyPos;
  public double xxVel;
  public double yyVel;
  public double mass;
  public String imgFileName;

  // constructors
  public Body(double xP, double yP, double xV,
              double yV, double m, String img) {
    xxPos = xP;
    yyPos = yP;
    xxVel = xV;
    yyVel = yV;
    mass = m;
    imgFileName = img;
  }

  public Body(Body b) {
    this.xxPos = b.xxPos;
    this.yyPos = b.yyPos;
    this.xxVel = b.xxVel;
    this.yyVel = b.yyVel;
    this.mass = b.mass;
    this.imgFileName = b.imgFileName;
  }

  // calculate distance (d) between two bodies
  public double calcDistance(Body b) {
    double d = (this.xxPos - b.xxPos) * (this.xxPos - b.xxPos) + 
               (this.yyPos - b.yyPos) * (this.yyPos - b.yyPos);
    return Math.sqrt(d);
  }

  // calcualte force (f) between two bodies
  public double calcForceExertedBy(Body b) {
    if (this.equals(b)) {
      return 0;
    }
    double G = 6.67e-11;
    return (G * this.mass * b.mass) / Math.pow(this.calcDistance(b), 2);
  }

  // calculate force (f) in the x direction
  public double calcForceExertedByX(Body b) {
    double dx = b.xxPos - this.xxPos;
    return this.calcForceExertedBy(b) * dx / this.calcDistance(b);
  }

  // calculate force (f) in the y direction
  public double calcForceExertedByY(Body b) {
    double dy = b.yyPos - this.yyPos;
    return this.calcForceExertedBy(b) * dy / this.calcDistance(b);
  }

  // calcualte net force in the x direction
  public double calcNetForceExertedByX(Body[] b) {
    double total = 0;
    for (Body body: b) {
      if (this.equals(body)) {
        continue;
      }
      total += this.calcForceExertedByX(body);
    }
    return total;
  }

  // calcualte net force in the y direction
  public double calcNetForceExertedByY(Body[] b) {
    double total = 0;
    for (Body body: b) {
      if (this.equals(body)) {
        continue;
      }
      total += this.calcForceExertedByY(body);
    }
    return total;
  }

  // update the position (p) and velocity (v) according to net forces
  public void update(double dt, double fX, double fY) {
    double ax = fX / this.mass;
    double ay = fY / this.mass;
    this.xxVel = this.xxVel + dt * ax;
    this.yyVel = this.yyVel + dt * ay;
    this.xxPos = this.xxPos + dt * this.xxVel;
    this.yyPos = this.yyPos + dt * this.yyVel;
  }

  // draw on canvas
  public void draw() {
    StdDraw.picture(this.xxPos, this.yyPos, this.imgFileName);
  }
}