package com.sdm.informationsystem;

import com.sdm.informationsystem.model.Training;
import com.sdm.informationsystem.service.TrainingService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ObserverPatternTest {

    @Test
    public void testObserverPattern() {
        Training training = new Training();
        TrainingService trainingService = Mockito.mock(TrainingService.class);

        // Register the observer
        training.registerObserver(trainingService);

        // Change the state of the Training object
        training.setTrainingContent("New Training Content");

        // Verify that the update method in the observer was called
        Mockito.verify(trainingService).update(training);
    }
}
