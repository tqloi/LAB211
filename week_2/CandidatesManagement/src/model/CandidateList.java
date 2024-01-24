package model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CandidateList {

    private final List<Intern> interns;
    private final List<Fresher> freshers;
    private final List<Experience> experiences;

    public CandidateList() {
        interns = new ArrayList<>();
        freshers = new ArrayList<>();
        experiences = new ArrayList<>();
    }

    public List<Intern> getInterns() {
        return interns;
    }

    public List<Fresher> getFreshers() {
        return freshers;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void addInterm(Intern i) {
        if (!interns.contains(i)) {
            interns.add(i);
        }
    }

    public void addFresher(Fresher f) {
        if (!freshers.contains(f)) {
            freshers.add(f);
        }
    }

    public void addExperience(Experience e) {
        if (!experiences.contains(e)) {
            experiences.add(e);
        }
    }

    public boolean delIntern(String id) {
        if (interns.removeIf((Intern p) -> p.getCandidateId().equals(id))) {
            return true;
        }
        return false;
    }

    public boolean delFresher(String id) {
        if (freshers.removeIf((Fresher p) -> p.getCandidateId().equals(id))) {
            return true;
        }
        return false;
    }

    public boolean delExperience(String id) {
        if (experiences.removeIf((Experience p) -> p.getCandidateId().equals(id))) {
            return true;
        }
        return false;
    }

    public <T> List<T> search(List<T> lists, Predicate<T> predicate) {
        List<T> objectList = new ArrayList<>();
        for (T o : lists) {
            if (predicate.test(o)) {
                objectList.add(o);
            }
        }
        return objectList;
    }

    
  
}
