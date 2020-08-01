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
public class thanhvienA implements topic.topic_observer{

    void dangky(topic Topic){
        Topic.dangky(this);
    }
    void huydangky(topic Topic){
        Topic.huydangky(this);
    }
    @Override
    public void nhantinmoi(String tinmoi) {
        System.out.println("thanhvien A "+tinmoi);
    }

    @Override
    public void nhantincapnhat(int vitri, String noidungcapnhat) {
        System.out.println(noidungcapnhat);
        
    }
    
}
