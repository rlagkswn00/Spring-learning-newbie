package gdsc.shine.springlearningsimple.bean.di;

public class StationSetterService {
    private StationRepository stationRepository;

    public String sayHi() {
        return stationRepository.sayHi();
    }
}
