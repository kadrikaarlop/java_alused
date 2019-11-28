import nhlstats.NHLStatistics;

class NHLStatisticsPart2 {

    public static void main(String[] args) {
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        NHLStatistics.searchByPlayer("Crosby");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
