package com.acts.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double score = 0;
        int count = 0;
        for (Pupil p : pupils) {
            for (Subject subject : p.subjects()) {
                score += subject.score();
                count++;
            }
        }
        return score / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        double score = 0;
        int count = 0;
        for (Pupil p : pupils) {
            for (Subject subject : p.subjects()) {
                score += subject.score();
                count++;
            }
            Label label = new Label(p.name(), score / count);
            score = 0;
            count = 0;
            labels.add(label);
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        HashMap<String, Integer> subjectAndScore = new HashMap<>();
        for (Pupil p : pupils) {
            for (Subject subject : p.subjects()) {
                if (subjectAndScore.containsKey(subject.name())) {
                    int tempScore = subjectAndScore.get(subject.name());
                    subjectAndScore.put(subject.name(), tempScore + subject.score());
                } else {
                    subjectAndScore.put(subject.name(), subject.score());
                }
            }
        }
        for (String key : subjectAndScore.keySet()) {
            labels.add(new Label(key, subjectAndScore.get(key) / (double) pupils.size()));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        int score = 0;
        for (Pupil p : pupils) {
            for (Subject s : p.subjects()) {
                score += s.score();
            }
            Label label = new Label(p.name(), score);
            labels.add(label);
            score = 0;
        }
        Collections.sort(labels);
        Collections.reverse(labels);
        return labels.get(0);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> list = averageScoreBySubject(pupils);
        Collections.sort(list);
        Collections.reverse(list);
        return list.get(0);
    }
}
