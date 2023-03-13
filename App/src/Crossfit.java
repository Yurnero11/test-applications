public class Crossfit extends SportTraining{
    private float maximum_projectile_weight;

    public Crossfit(float maximum_projectile_weight, double average_heart_rate_per_workout, double training_duration, double athlete_weight){
        super(average_heart_rate_per_workout,training_duration,athlete_weight);
        this.maximum_projectile_weight = maximum_projectile_weight;
    }

    @Override
    public void printMessage(){
        System.out.printf("Кроссфит! " + training_duration + " минут. " + "Максимальный вес штанги: " + maximum_projectile_weight + "кг. Килокалорий: " + resultEnergy());
    }
}
