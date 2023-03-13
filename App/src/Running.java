public class Running extends SportTraining{
    private double distance;

    public Running(double average_heart_rate_per_workout, double training_duration, double athlete_weight, double distance){
        super(average_heart_rate_per_workout,training_duration,athlete_weight);
        this.distance = distance;
    }


    @Override
    public void printMessage(){
        System.out.printf("Беговая тренировка! " + training_duration + " минут." + " Дистанция: " + distance + " метров. Килокалорий: " + resultEnergy());
    }
}
