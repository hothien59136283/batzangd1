/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package on_thi_obsever_1;

/**
 *
 * @author Pii
 */
public class On_thi_obsever_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        topic Topic  = new topic();
        thanhvienA tva = new thanhvienA();
        thanhvienB tvb = new thanhvienB();
        tva.dangky(Topic);
        tvb.dangky(Topic);
        Topic.taotinmoi("ruiuyyiiii");
        // TODO code application logic here
    }
    
}
