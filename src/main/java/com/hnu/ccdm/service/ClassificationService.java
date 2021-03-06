package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.Classification;

import java.util.List;

public interface ClassificationService {
    List<Classification> getClassificationList ();

    int addClassification(Classification classification);
    int deleteClassification(String id);
}
