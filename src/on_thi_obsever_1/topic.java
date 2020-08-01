/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package on_thi_obsever_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pii
 */
public class topic {
    
    List<topic_observer> danhsachthanhvien = new ArrayList<>();
    List<String> danhsachtin = new ArrayList<>();
    
    void dangky(topic_observer observer){
        danhsachthanhvien.add(observer);
        
    }
    void huydangky(topic_observer observer){
        danhsachthanhvien.remove(observer);
    }
    
    void taotinmoi(String tinmoi){
        danhsachtin.add(tinmoi);  
        for(int i=0;i<danhsachthanhvien.size();i++){
            danhsachthanhvien.get(i).nhantinmoi(tinmoi);
        }
    }
    void capnhattin(int vitri, String noidungcapnhat){
        danhsachtin.remove(vitri);
        danhsachtin.add(noidungcapnhat);
        for(int i=0;i<danhsachthanhvien.size();i++){
            danhsachthanhvien.get(i).nhantincapnhat(vitri,noidungcapnhat);
        }
    }
    public static interface topic_observer{
        void nhantinmoi(String tinmoi);
        void nhantincapnhat(int vitri, String noidungcapnhat);
    }
    
}
