package com.example.demo.service.recommendCalc;

import org.neo4j.driver.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

import java.lang.Record;

@Service
public class GetDistance {
    @Value("neo4j+s://f8fbf000.databases.neo4j.io")
    String neo4jUri;

    @Value("neo4j")
    String neo4jUser;

    @Value("qEqCRw9ODwM0jrJSu0bWkXgk0SWlXJZetVU6pZ0JmwM")
    String neo4jPassword;

//    public static float getDistance(String stack1, String stack2){
//
//        float distance=0;
//
//        try (Driver driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
//             Session session = driver.session()) {
//            String start="MATCH path=allShortestPaths((startNode:techStack {techStack: '";
//            String middle="'})-[:relation*..10]-(endNode:techStack {techStack: '";
//            String end="'}))" +
//                    "RETURN REDUCE(s = 0, rel IN relationships(path) | s + rel.weight) AS totalWeight";
//
//            String query=start+stack1+middle+stack2+end;
//
//            Result result = session.run(query);
//
//            Record record = result.next();
//            Value totalWeight = record.get("totalWeight");
//            System.out.println("Total Weight: " + totalWeight.asDouble());
//            distance=totalWeight.asFloat();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return distance;
//    }
}
