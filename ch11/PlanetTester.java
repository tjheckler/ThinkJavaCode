public class PlanetTester
{

    public static void main(String[] args)
    {
        Planet mercury = new Planet("Mercury");
        Planet venus = new Planet("Venus");
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars");
        Planet saturn = new Planet("Saturn");
        Planet jupiter = new Planet("Jupiter");
        Planet uranus = new Planet("Uranus");
        Planet neptune = new Planet("Neptune");
        Planet pluto = new Planet("Pluto");


        Planet[] planets = new Planet[9];
        planets[0] = mercury;
        planets[1] = venus;
        planets[2] = earth;
        planets[3] = mars;
        planets[4] = saturn;
        planets[5] = jupiter;
        planets[6] = uranus;
        planets[7] = neptune;
        planets[8] = pluto;
        printPlanets(planets);
    }

    public static void printPlanets(Planet[] planets)
    {
for (Planet planet: planets)
{
    System.out.println(planet.getName());
}
    }
}
