package TPEspecialParte1;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class VisorMazo {

    public static void mostrarMazo(String jsonFile) {
        //URL url = getClass().getResource(jsonFile);
        File jsonInputFile = new File(jsonFile);
        InputStream is;
        try {
            is = new FileInputStream(jsonInputFile);
            // Creo el objeto JsonReader de Json.
            JsonReader reader = Json.createReader(is);
            // Obtenemos el JsonObject a partir del JsonReader.
            JsonArray cartas = (JsonArray) reader.readObject().getJsonArray("cartas");
            //for (JsonObject carta : cartas.getValuesAs(JsonObject.class)) {
            	for(int i = 0 ; i < cartas.getValuesAs(JsonObject.class).size(); i++) {
            		
            	//}
                String nombreCarta = cartas.getValuesAs(JsonObject.class).get(i).getString("nombre");
                Carta i = new Carta(nombreCarta);
                JsonObject atributos = (JsonObject) cartas.getValuesAs(JsonObject.class).get(i).getJsonObject("atributos");
                String atributosStr = "";
                for (String nombreAtributo:atributos.keySet())
                    atributosStr = atributosStr + nombreAtributo + ": " +
                            atributos.getInt(nombreAtributo) + "; ";
                System.out.println(nombreCarta+"\t\t\t"+atributosStr);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    	/*String mazoPath = "./superheroes.json";
        VisorMazo.mostrarMazo(mazoPath);
    */}

}

