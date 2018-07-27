package velsol.com.expandblelists.helpers;

/**
 * Created by Velsol 170016 on 7/16/2018.
 */
//its a model class respective to the adding php fies
public class MSG
{
    public  String message;
    public Integer response;

    public MSG(String message, Integer response) {
        this.message = message;
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getResponse() {
        return response;
    }

    public void setResponse(Integer response) {
        this.response = response;
    }
}
