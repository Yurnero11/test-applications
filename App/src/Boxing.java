public class Boxing extends SportTraining{
    public Boxing(double average_heart_rate_per_workout, double training_duration, double athlete_weight){
        super(average_heart_rate_per_workout,training_duration,athlete_weight);
    }

    @Override
    public void printMessage() {
        System.out.printf("Тренировка по кикбоксингу! " + training_duration + " минут. Килокалорий: "  + resultEnergy());
    }
}
