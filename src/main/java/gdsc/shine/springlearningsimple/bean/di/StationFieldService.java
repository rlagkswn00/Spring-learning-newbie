package gdsc.shine.springlearningsimple.bean.di;

public class StationFieldService {
    private StationRepository stationRepository;

    public String sayHi() {
        return stationRepository.sayHi();
    }
}
