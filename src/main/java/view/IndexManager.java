package view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author
 */
@ManagedBean
@RequestScoped
public class IndexManager {

    private String helloString = "Hello BAJS World";
    /**
     * Creates a new instance of IndexManager
     */
    public IndexManager() {
    }

    public String getHelloString() {
        return helloString;
    }

    public void setHelloString(String helloString) {
        this.helloString = helloString;
    }
    
}
