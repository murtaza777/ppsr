package au.gov.ppsr.model;

import java.io.Serializable;
import java.util.Map;

/**
 * @author kheriwalam5g
 * @since <version>
 */
public class Operation implements Serializable {
  private String operationName;
  private Map<String, String> parameters;
  private String endpoint;

  public String getOperationName() {
    return operationName;
  }

  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }

  public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  @Override
  public String toString() {
    return "Operation{" +
            "operationName='" + operationName + '\'' +
            ", parameters=" + parameters +
            ", endpoint='" + endpoint + '\'' +
            '}';
  }
}
