package MentorLessons.Lesson8;

public enum Month {
    January(Season.WINTER),February(Season.WINTER),March(Season.SPRING),April(Season.SPRING),May(Season.SPRING),June(Season.SUMMER),July(Season.SUMMER),August(Season.SUMMER),September(Season.AUTUMN),October(Season.AUTUMN),Novomber(Season.AUTUMN),December(Season.WINTER);


    private final Season season;
    Month(Season season) {
        this.season = season;
    }
    public Season getSeasons(){
        return season;
    }

    enum Season {
        WINTER, AUTUMN,SPRING,SUMMER
    }

}
