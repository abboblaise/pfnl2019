package cm.gov.minfof.model.entity;

import java.io.IOException;


import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public final class CrypteDecrypte {
    public String codedecode (String _mot, int type) throws IOException {
        @SuppressWarnings("oracle.jdeveloper.java.semantic-warning")

        String _rst = null;
        if (type == 1){
            
            _rst = new BASE64Encoder().encode(_mot.getBytes());
        }else {
            byte[] dec = new BASE64Decoder().decodeBuffer(_mot);
            _rst = new String(dec);
        }
        
        return _rst;
    }
    
}
