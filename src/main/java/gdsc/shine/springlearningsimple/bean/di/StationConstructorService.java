package gdsc.shine.springlearningsimple.bean.di;

public class StationConstructorService {
    private StationRepository stationRepository;

    public String sayHi() {
        return stationRepository.sayHi();
    }
}
