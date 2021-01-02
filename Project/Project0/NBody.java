public class NBody {

  public static double readRadius(String fileName) {
    In in = new In(fileName);
    in.readInt();
    double r = in.readDouble();
    return r;
  }

  public static Body[] readBodies(String fileName) {
    In in = new In(fileName);
    in.readInt();
    in.readDouble();
    Body[] bodies = new Body[5];
    for (int i = 0; i < 5; i++) {
      double xPos = in.readDouble();
      double yPos = in.readDouble();
      double xVel = in.readDouble();
      double yVel = in.readDouble();
      double mass = in.readDouble();
      String imgFileName = in.readString();
      imgFileName = "images/" + imgFileName;
      bodies[i] = new Body(xPos, yPos, xVel, yVel, mass, imgFileName);
    }
    return bodies;
  }

  public static void main(String[] args) {

    // command line options
    double T = Double.parseDouble(args[0]);
    double dt = Double.parseDouble(args[1]);
    String fileName = args[2];
    double radius = readRadius(fileName);
    Body[] bodies = readBodies(fileName);

    // setting for the canvas
    StdDraw.enableDoubleBuffering();
    StdDraw.setScale(-radius, radius);
    StdDraw.clear();
    StdDraw.picture(0, 0, "images/starfield.jpg");
    StdAudio.play("audio/2001.mid");
    for (Body b: bodies) {
      b.draw();
    }

    // planet motions
    for (double t = 0; t < T; t += dt) {
      double[] xForces = new double[bodies.length];
      double[] yForces = new double[bodies.length];
      for (int i = 0; i < bodies.length; i++) {
        xForces[i] = bodies[i].calcNetForceExertedByX(bodies);
        yForces[i] = bodies[i].calcNetForceExertedByY(bodies);
      }
      for (int i = 0; i < bodies.length; i++) {
        bodies[i].update(dt, xForces[i], yForces[i]);
      }
      StdDraw.picture(0, 0, "images/starfield.jpg");
      for (Body b: bodies) {
        b.draw();
      }
      StdDraw.show();
      StdDraw.pause(10);
    }

    // printing the universe
    StdOut.printf("%d\n", bodies.length);
    StdOut.printf("%.2e\n", radius);
    for (int i = 0; i < bodies.length; i++) {
      StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                    bodies[i].xxPos, bodies[i].yyPos, bodies[i].xxVel,
                    bodies[i].yyVel, bodies[i].mass, bodies[i].imgFileName);   
    }
  } 
}
