package co.com.cesarnorena.pokedex.restService;

import co.com.cesarnorena.pokedex.model.Pokedex;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Cesar Norena on 20/02/2016.
 */
public interface PokedexServices {

    /**
     * @return A Pokedex returns the names and resource_uri for all pokemon
     */
    @GET("pokedex/1/")
    Call<Pokedex> getPokedex();
}
