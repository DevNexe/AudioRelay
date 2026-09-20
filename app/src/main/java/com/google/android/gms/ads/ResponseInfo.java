package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.internal.ads.zzcgn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ResponseInfo {
    public final zzdh a;
    public final ArrayList b = new ArrayList();
    public final AdapterResponseInfo c;

    public ResponseInfo(zzdh zzdhVar) {
        this.a = zzdhVar;
        if (zzdhVar != null) {
            try {
                List listZzi = zzdhVar.zzi();
                if (listZzi != null) {
                    Iterator it = listZzi.iterator();
                    while (it.hasNext()) {
                        AdapterResponseInfo adapterResponseInfoZza = AdapterResponseInfo.zza((zzu) it.next());
                        if (adapterResponseInfoZza != null) {
                            this.b.add(adapterResponseInfoZza);
                        }
                    }
                }
            } catch (RemoteException e) {
                zzcgn.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        zzdh zzdhVar2 = this.a;
        if (zzdhVar2 == null) {
            return;
        }
        try {
            zzu zzuVarZzf = zzdhVar2.zzf();
            if (zzuVarZzf != null) {
                this.c = AdapterResponseInfo.zza(zzuVarZzf);
            }
        } catch (RemoteException e2) {
            zzcgn.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
        }
    }

    public static ResponseInfo zza(zzdh zzdhVar) {
        if (zzdhVar != null) {
            return new ResponseInfo(zzdhVar);
        }
        return null;
    }

    public static ResponseInfo zzb(zzdh zzdhVar) {
        return new ResponseInfo(zzdhVar);
    }

    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.b;
    }

    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.c;
    }

    public String getMediationAdapterClassName() {
        try {
            zzdh zzdhVar = this.a;
            if (zzdhVar != null) {
                return zzdhVar.zzg();
            }
            return null;
        } catch (RemoteException e) {
            zzcgn.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    public Bundle getResponseExtras() {
        try {
            zzdh zzdhVar = this.a;
            if (zzdhVar != null) {
                return zzdhVar.zze();
            }
        } catch (RemoteException e) {
            zzcgn.zzh("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new Bundle();
    }

    public String getResponseId() {
        try {
            zzdh zzdhVar = this.a;
            if (zzdhVar != null) {
                return zzdhVar.zzh();
            }
            return null;
        } catch (RemoteException e) {
            zzcgn.zzh("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    public String toString() {
        try {
            return zzc().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final JSONObject zzc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((AdapterResponseInfo) it.next()).zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        AdapterResponseInfo adapterResponseInfo = this.c;
        if (adapterResponseInfo != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo.zzb());
        }
        Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            jSONObject.put("Response Extras", zzaw.zzb().zzh(responseExtras));
        }
        return jSONObject;
    }
}
