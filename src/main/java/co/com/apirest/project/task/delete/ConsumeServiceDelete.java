package co.com.apirest.project.task.delete;

import co.com.apirest.project.interactions.DeleteRequest;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class ConsumeServiceDelete {

    public Performable apiDelete(String baseUrl, String request, String typeContent) {
        return Task.where("{0} call the service at execute GET",
                DeleteRequest.params(baseUrl, request, typeContent)
        );
    }
}