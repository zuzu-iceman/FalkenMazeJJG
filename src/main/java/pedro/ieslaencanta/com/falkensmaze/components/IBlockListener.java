/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pedro.ieslaencanta.com.falkensmaze.components;

/**
 *
 * @author JJG
 */

//Interfaz para escuchar los  eventos del clic en bloques
public interface IBlockListener {
    public void onClicked(Block b);
    public void onDoubleClicked(Block b);
}
