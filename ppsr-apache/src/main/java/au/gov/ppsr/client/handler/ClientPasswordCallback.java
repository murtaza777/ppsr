package au.gov.ppsr.client.handler;

import org.apache.ws.security.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: murtaza
 * Date: 16/03/2014
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClientPasswordCallback implements CallbackHandler {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
        if (username.equals(pc.getIdentifier())) {
            pc.setPassword("NewPas$w0rd");
        }
    }
}
