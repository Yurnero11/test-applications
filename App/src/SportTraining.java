public class SportTraining {
    protected double average_heart_rate_per_workout; //средний пульс за тренировку
    protected double training_duration; // длительность тренировки(в минутах)
    protected double athlete_weight; // вес спортсмена

    protected SportTraining(double average_heart_rate_per_workout, double training_duration, double athlete_weight){
        this.average_heart_rate_per_workout = average_heart_rate_per_workout;
        this.training_duration = training_duration;
        this.athlete_weight = athlete_weight;
    }

    protected double resultEnergy(){
        double energy = 0.014 * athlete_weight * training_duration * (0.12 * average_heart_rate_per_workout - 7);
        return energy;
    }

    void printMessage(){}

}
