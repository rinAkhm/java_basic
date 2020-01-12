package topic3.abstraction.лекция;

import topic3.abstraction.лекция.hr_skills.Python;
import topic3.abstraction.лекция.profession.*;

public class Main {
    public static void main(String[] args) {
        Engineer[] engineers = {new FrontEndDeveloper(), new WebDeveloper()};
        Python[] pythons = {new FullStackDesigner(), new PythonDeveloper()};

        Python fullStackDesigner = new FullStackDesigner();
        ((FullStackDesigner) fullStackDesigner).doProgramming();
    }
}
