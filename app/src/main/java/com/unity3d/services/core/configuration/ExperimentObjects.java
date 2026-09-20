package com.unity3d.services.core.configuration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ExperimentObjects extends ExperimentsBase {
    private final Map<String, ExperimentObject> _experimentObjects = new HashMap();
    private final JSONObject _experimentObjetsData;

    public ExperimentObjects(JSONObject jSONObject) {
        if (jSONObject == null) {
            this._experimentObjetsData = new JSONObject();
            return;
        }
        this._experimentObjetsData = jSONObject;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this._experimentObjects.put(next, new ExperimentObject(jSONObject.optJSONObject(next)));
        }
    }

    private boolean getExperimentValue(String str) {
        ExperimentObject experimentObject = getExperimentObject(str);
        if (experimentObject != null) {
            return experimentObject.getBooleanValue();
        }
        return false;
    }

    private JSONObject getExperimentWithAppliedRule(ExperimentAppliedRule experimentAppliedRule) {
        HashMap map = new HashMap();
        for (Map.Entry<String, ExperimentObject> entry : this._experimentObjects.entrySet()) {
            if (entry.getValue().getAppliedRule() == experimentAppliedRule) {
                map.put(entry.getKey(), String.valueOf(entry.getValue().getBooleanValue()));
            }
        }
        return new JSONObject(map);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public JSONObject getCurrentSessionExperiments() {
        return getExperimentWithAppliedRule(ExperimentAppliedRule.IMMEDIATE);
    }

    public ExperimentObject getExperimentObject(String str) {
        return this._experimentObjects.get(str);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public Map<String, String> getExperimentTags() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ExperimentObject> entry : this._experimentObjects.entrySet()) {
            map.put(entry.getKey(), String.valueOf(entry.getValue().getBooleanValue()));
        }
        return map;
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public JSONObject getExperimentsAsJson() {
        return this._experimentObjetsData;
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public JSONObject getNextSessionExperiments() {
        return getExperimentWithAppliedRule(ExperimentAppliedRule.NEXT);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isForwardExperimentsToWebViewEnabled() {
        return getExperimentValue("fff");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isNativeTokenEnabled() {
        return getExperimentValue("tsi_nt");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isNativeWebViewCacheEnabled() {
        return getExperimentValue("nwc");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isNewLifecycleTimer() {
        return getExperimentValue("nlt");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isPrivacyRequestEnabled() {
        return getExperimentValue("tsi_prr");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isTwoStageInitializationEnabled() {
        return getExperimentValue("tsi");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isUpdatePiiFields() {
        return getExperimentValue("tsi_upii");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebAssetAdCaching() {
        return getExperimentValue("wac");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean shouldNativeTokenAwaitPrivacy() {
        return getExperimentValue("tsi_prw");
    }
}
