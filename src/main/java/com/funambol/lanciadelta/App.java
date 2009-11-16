package com.funambol.lanciadelta;

import com.funambol.lanciadelta.rally.LanciaDeltaService;

import com.rallydev.webservice.v1_14.domain.*;
import com.rallydev.webservice.v1_14.service.*;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App implements Constants {

    public static void main(String[] args) throws Exception {
        LanciaDeltaService service = LanciaDeltaService.getInstance();

        User user = (User)service.getCurrentUser();

        System.out.append("User: " + user.getDisplayName());
        user = (User)service.read(user);
        Project[] projects = user.getProjects();

        System.out.println("projects: " + projects);

        List<Iteration> iterations = (service.getIterations("FEB0901"));
        for (Iteration i: iterations) {
            System.out.println("Iteration: " + i.getName());
        }

        /*
        Workspace w = new Workspace();
        w.setRef(RALLY_URL + '/' + WORKSPACE + <aworkspace>);
        w = (Workspace)service.read(w);
        projects = w.getProjects();
        for (Project p: projects) {
            p = (Project)service.read(p);
            System.out.println(p.getName());
            Iteration[] its = p.getIterations();
            for (Iteration i: its) {
                i = (Iteration)service.read(i);
                System.out.println("\t" + i.getName());

            }
        }
        */

        final String Q = "(Iteration = https://rally1.rallydev.com:443/slm/webservice/1.10/iteration/171173739)";
        final int PAGE = 10;

        boolean cont = true;
        long i = 1, tot = 0;
        do {
            QueryResult rs = service.query(null, HIERARCHICAL_REQUIREMENT, Q, "", true, i, PAGE);
            DomainObject[] results = rs.getResults();
            tot = rs.getTotalResultCount();

            System.out.println("===");
            for (DomainObject o: results) {
                Artifact a = (Artifact)o;
                System.out.println((i++) + ": " + a.getName());
            }
        } while (i<=tot);

    }
}
