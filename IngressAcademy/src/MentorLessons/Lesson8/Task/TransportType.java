package MentorLessons.Lesson8.Task;

public enum TransportType {

    AVTOBUS {
        @Override
        public double calculateCost(double distance) {
            final double AVTOBUS_COST = 0.5;
            return distance*AVTOBUS_COST;
        }
    },
    QATAR {
        @Override
        public double calculateCost(double distance) {
            final double QATAR_COST = 0.8;
            if (distance < 100) {
                return distance*QATAR_COST;
            }
            else {
                return (distance*QATAR_COST)*0.9;
            }
        }
    }, TƏYYARƏ {
        @Override
        public double calculateCost(double distance) {
            final double TEYYARE_COST = 1.5;
            return (distance*TEYYARE_COST) + 50;
        }
    };

    public abstract double calculateCost(double distance);
}
