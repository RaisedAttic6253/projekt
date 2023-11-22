import java.util.ArrayList;
import java.util.List;

public class SeznamNabytku {
    private List<Nabytek> seznamNabytku = new ArrayList<>();
    public void  pridejNabytek(Nabytek nabytek){
        seznamNabytku.add(nabytek);
    }
    public void odstranNabytek(Nabytek nabytek){
        seznamNabytku.remove(nabytek);
    }
    public Nabytek vypisNabytekZeSeznamu(int vypsat){
        return seznamNabytku.get(vypsat);
    }
    public Double zjistiCelkovouHmotnost() {
        Double celkovaHmotnost = 0.0;
        for (Nabytek nabytek : seznamNabytku) {
            celkovaHmotnost += nabytek.getHmotnost();
        }
        return celkovaHmotnost;
    }
    public List<Nabytek> getSeznamNabytku(){
        return seznamNabytku;
    }
}
