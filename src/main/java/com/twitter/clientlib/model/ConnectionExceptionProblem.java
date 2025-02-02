/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
https://openapi-generator.tech
Do not edit the class manually.
*/


package com.twitter.clientlib.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.twitter.clientlib.model.ClientDisconnectedProblem;
import com.twitter.clientlib.model.ClientForbiddenProblem;
import com.twitter.clientlib.model.ConflictProblem;
import com.twitter.clientlib.model.ConnectionExceptionProblem;
import com.twitter.clientlib.model.ConnectionExceptionProblemAllOf;
import com.twitter.clientlib.model.DisallowedResourceProblem;
import com.twitter.clientlib.model.DuplicateRuleProblem;
import com.twitter.clientlib.model.FieldUnauthorizedProblem;
import com.twitter.clientlib.model.GenericProblem;
import com.twitter.clientlib.model.InvalidRequestProblem;
import com.twitter.clientlib.model.InvalidRuleProblem;
import com.twitter.clientlib.model.NonCompliantRulesProblem;
import com.twitter.clientlib.model.OperationalDisconnectProblem;
import com.twitter.clientlib.model.Problem;
import com.twitter.clientlib.model.ResourceNotFoundProblem;
import com.twitter.clientlib.model.ResourceUnauthorizedProblem;
import com.twitter.clientlib.model.ResourceUnavailableProblem;
import com.twitter.clientlib.model.RulesCapProblem;
import com.twitter.clientlib.model.UnsupportedAuthenticationProblem;
import com.twitter.clientlib.model.UsageCapExceededProblem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.twitter.clientlib.JSON;

/**
 * A problem that indicates something is wrong with the connection
 */
@ApiModel(description = "A problem that indicates something is wrong with the connection")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionExceptionProblem extends Problem {
  /**
   * Gets or Sets connectionIssue
   */
  @JsonAdapter(ConnectionIssueEnum.Adapter.class)
  public enum ConnectionIssueEnum {
    TOOMANYCONNECTIONS("TooManyConnections"),
    
    PROVISIONINGSUBSCRIPTION("ProvisioningSubscription"),
    
    RULECONFIGURATIONISSUE("RuleConfigurationIssue"),
    
    RULESINVALIDISSUE("RulesInvalidIssue");

    private String value;

    ConnectionIssueEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConnectionIssueEnum fromValue(String value) {
      for (ConnectionIssueEnum b : ConnectionIssueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConnectionIssueEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConnectionIssueEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConnectionIssueEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConnectionIssueEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONNECTION_ISSUE = "connection_issue";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ISSUE)
  private ConnectionIssueEnum connectionIssue;

  public ConnectionExceptionProblem() { 
    this.type = this.getClass().getSimpleName();
  }

  public ConnectionExceptionProblem connectionIssue(ConnectionIssueEnum connectionIssue) {
    
    this.connectionIssue = connectionIssue;
    return this;
  }

   /**
   * Get connectionIssue
   * @return connectionIssue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionIssueEnum getConnectionIssue() {
    return connectionIssue;
  }


  public void setConnectionIssue(ConnectionIssueEnum connectionIssue) {
    this.connectionIssue = connectionIssue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionExceptionProblem connectionExceptionProblem = (ConnectionExceptionProblem) o;
    return Objects.equals(this.connectionIssue, connectionExceptionProblem.connectionIssue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionIssue, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionExceptionProblem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    connectionIssue: ").append(toIndentedString(connectionIssue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("type");
    openapiFields.add("title");
    openapiFields.add("detail");
    openapiFields.add("status");
    openapiFields.add("connection_issue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("title");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectionExceptionProblem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConnectionExceptionProblem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectionExceptionProblem is not found in the empty JSON string", ConnectionExceptionProblem.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConnectionExceptionProblem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConnectionExceptionProblem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConnectionExceptionProblem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectionExceptionProblem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectionExceptionProblem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectionExceptionProblem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectionExceptionProblem.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectionExceptionProblem>() {
           @Override
           public void write(JsonWriter out, ConnectionExceptionProblem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConnectionExceptionProblem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConnectionExceptionProblem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectionExceptionProblem
  * @throws IOException if the JSON string is invalid with respect to ConnectionExceptionProblem
  */
  public static ConnectionExceptionProblem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectionExceptionProblem.class);
  }

 /**
  * Convert an instance of ConnectionExceptionProblem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

