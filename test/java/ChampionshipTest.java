import models.Championship;
import models.Swimmer;
import models.Triathlete;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChampionshipTest {

    //need championship

    Championship championship;

    //need swimmer

    Swimmer swimmer;

    //need triathlete

    Triathlete triathlete;

    @BeforeEach

    public void setUp() {
    //make a championship
    championship =new Championship("World Athletics");
    swimmer = new Swimmer("Jane");
    triathlete = new Triathlete("Kevin");

}

    @Test
    //ensure can add swimmer to championship

    public void canAddSwimmingAthleteToChampionship(){
        //take championship + add swimmer

        championship.addSwimmer(swimmer);
        championship.addSwimmer(triathlete);

    //check count of swimmer inside championship. Should be 2^
        assertThat(championship.getSwimmerCount()).isEqualTo(2);
    }

}
