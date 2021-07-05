/*
 * This is a class GENERATED by the TransportGenerator maven plugin. DON'T MODIFY IT.
 * IF you modify it, your work may be lost: the class will be overwritten automatically
 * when the maven plugin is re-executed for any reasons.
 */
package de.fhg.iais.roberta.generated.restEntities;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * DEPRECATED: remove after 4.0.0 deplyoment<br>
 * <br>
 * Version: 1<br>
 * Datum: 2020-06-15
 */
public class ProjectWorkflowResetRequest extends BaseRequest {
    protected String robot;

    /**
     * DEPRECATED: remove after 4.0.0 deplyoment
     */
    public static ProjectWorkflowResetRequest make() {
        return new ProjectWorkflowResetRequest();
    }

    /**
     * DEPRECATED: remove after 4.0.0 deplyoment
     */
    public static ProjectWorkflowResetRequest makeFromString(String jsonS) {
        try {
            JSONObject jsonO = new JSONObject(jsonS);
            return make(jsonO);
        } catch ( JSONException e ) {
            throw new RuntimeException("JSON parse error when parsing: " + jsonS, e);
        }
    }

    /**
     * DEPRECATED: remove after 4.0.0 deplyoment
     */
    public static ProjectWorkflowResetRequest makeFromProperties(String cmd, String robot) {
        ProjectWorkflowResetRequest entity = new ProjectWorkflowResetRequest();
        entity.setCmd(cmd);
        entity.setRobot(robot);
        entity.immutable();
        return entity;
    }

    /**
     * DEPRECATED: remove after 4.0.0 deplyoment
     */
    public static ProjectWorkflowResetRequest make(JSONObject jsonO) {
        return make().merge(jsonO).immutable();
    }

    /**
     * merge the properties of a JSON-object into this bean. The bean must be "under construction".
     * The keys of the JSON-Object must be valid. The bean remains "under construction".<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public ProjectWorkflowResetRequest merge(JSONObject jsonO) {
        try {
            for ( String key : JSONObject.getNames(jsonO) ) {
                if ( "_version".equals(key) ) {
                } else if ( "cmd".equals(key) ) {
                    setCmd(jsonO.optString(key));
                } else if ( "robot".equals(key) ) {
                    setRobot(jsonO.optString(key));
                } else {
                    throw new RuntimeException("JSON parse error. Found invalid key: " + key + " in " + jsonO);
                }
            }
            return this;
        } catch ( Exception e ) {
            throw new RuntimeException("JSON parse / casting error when parsing: " + jsonO, e);
        }
    }

    /**
     * moves a bean from state "under construction" to state "immutable".<br>
     * Checks whether all required fields are set. All lists are made immutable.<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public ProjectWorkflowResetRequest immutable() {
        if ( this.immutable ) {
            return this;
        }
        this.immutable = true;
        return validate();
    }

    /**
     * Checks whether all required fields are set.<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    private ProjectWorkflowResetRequest validate() {
        String _message = null;
        if ( !this.immutable ) {
            _message = "ProjectWorkflowResetRequest-object is already immutable: " + toString();
        }
        if ( _message != null ) {
            this.immutable = false;
            throw new RuntimeException(_message);
        }
        return this;
    }

    /**
     * GET robot. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getRobot() {
        if ( !this.immutable ) {
            throw new RuntimeException("no robot from an object under construction: " + toString());
        }
        return this.robot;
    }

    /**
     * is the property defined? The property maybe undefined as it is not a required property
     *
     * @return true if the property is defined (has been set)
     */
    public boolean robotDefined() {
        return this.robot != null;
    }

    /**
     * SET robot. Object must be mutable.
     */
    public ProjectWorkflowResetRequest setRobot(String robot) {
        if ( this.immutable ) {
            throw new RuntimeException("robot assigned to an immutable object: " + toString());
        }
        this.robot = robot;
        return this;
    }

    /**
     * generates a JSON-object from an immutable bean.<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public JSONObject toJson() {
        if ( !this.immutable ) {
            throw new RuntimeException("no JSON from an object under construction: " + toString());
        }
        JSONObject jsonO = new JSONObject();
        try {
            jsonO.put("_version", "1");
            if ( this.cmd != null ) {
                jsonO.put("cmd", this.cmd);
            }
            if ( this.robot != null ) {
                jsonO.put("robot", this.robot);
            }
        } catch ( JSONException e ) {
            throw new RuntimeException("JSON unparse error when unparsing: " + this, e);
        }
        return jsonO;
    }

    @Override
    public String toString() {
        return "ProjectWorkflowResetRequest [immutable=" + this.immutable + ", cmd=" + this.cmd + ", robot=" + this.robot + " ]";
    }

    @Override
    public int hashCode() {
        throw new RuntimeException("no hashCode from transport beans!");
    }

    @Override
    public boolean equals(Object obj) {
        throw new RuntimeException("no equals from transport beans!");
    }

}
