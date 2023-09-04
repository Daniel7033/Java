package Mostrar;

import Entity.Artista.Artista;
import Entity.Canciones.Canciones;
import Utils.FunctionNumeric;
import Utils.FunctionString;
public class View {

    public static void main(String[] args) {
        FunctionString fs = new FunctionString();
        FunctionNumeric fn = new FunctionNumeric();
        /*  **********************************************
        Array de los artistas, sus nombres y id    */
        Artista artista[] = new Artista[5];
        artista[0] = new Artista(1, "Bus Banni");
        artista[1] = new Artista(2, "Khebedo");
        artista[2] = new Artista(3, "Duquo");
        artista[3] = new Artista(4, "Fakuma");
        artista[4] = new Artista(5, "Phoenix");
        for (int i = 0; i < artista.length; i++) {
            fs.ShowScanner(artista[i].getIdArtista() + " - " + artista[i].getNombreArtista() + ".\n");
        }
        //  *******************************************
        
        /*  **********************************************
        Array de las canciones con sus id,  nombres de las canciones y el id de los artistas a cuales pertenecen las canciones     */
        Canciones cancion[] = new Canciones[25];
        cancion[0] = new Canciones(31, artista[0].getIdArtista(), "a");
        cancion[1] = new Canciones(32, artista[0].getIdArtista(), "b");
        cancion[2] = new Canciones(33, artista[0].getIdArtista(), "c");
        cancion[3] = new Canciones(34, artista[0].getIdArtista(), "d");
        cancion[4] = new Canciones(35, artista[0].getIdArtista(), "e");
        cancion[5] = new Canciones(36, artista[1].getIdArtista(), "f");
        cancion[6] = new Canciones(37, artista[1].getIdArtista(), "g");
        cancion[7] = new Canciones(38, artista[1].getIdArtista(), "H");
        cancion[8] = new Canciones(39, artista[1].getIdArtista(), "i");
        cancion[9] = new Canciones(40, artista[1].getIdArtista(), "j");
        cancion[10] = new Canciones(41, artista[2].getIdArtista(), "k");
        cancion[11] = new Canciones(42, artista[2].getIdArtista(), "l");
        cancion[12] = new Canciones(43, artista[2].getIdArtista(), "m");
        cancion[13] = new Canciones(44, artista[2].getIdArtista(), "n");
        cancion[14] = new Canciones(45, artista[2].getIdArtista(), "ñ");
        cancion[15] = new Canciones(46, artista[3].getIdArtista(), "o");
        cancion[16] = new Canciones(47, artista[3].getIdArtista(), "p");
        cancion[17] = new Canciones(48, artista[3].getIdArtista(), "q");
        cancion[18] = new Canciones(49, artista[3].getIdArtista(), "r");
        cancion[19] = new Canciones(50, artista[3].getIdArtista(), "s");
        cancion[20] = new Canciones(51, artista[4].getIdArtista(), "t");
        cancion[21] = new Canciones(52, artista[4].getIdArtista(), "u");
        cancion[22] = new Canciones(53, artista[4].getIdArtista(), "v");
        cancion[23] = new Canciones(54, artista[4].getIdArtista(), "w");
        cancion[24] = new Canciones(55, artista[4].getIdArtista(), "x");
        for (int i = 0; i < cancion.length; i++) {
            fs.ShowScanner("Cancion " + cancion[i].getIdCancion() + " - " + cancion[i].getCancion()  + " Artista: " + cancion[i].getIdArtista() +  ".\n");
        }
    }
}
