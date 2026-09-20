package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfka {
    public final zzfkh a;
    public final zzfkh b;
    public final zzfke c;
    public final zzfkg d;

    public zzfka(zzfke zzfkeVar, zzfkg zzfkgVar, zzfkh zzfkhVar, zzfkh zzfkhVar2) {
        this.c = zzfkeVar;
        this.d = zzfkgVar;
        this.a = zzfkhVar;
        if (zzfkhVar2 == null) {
            this.b = zzfkh.NONE;
        } else {
            this.b = zzfkhVar2;
        }
    }

    public static zzfka zza(zzfke zzfkeVar, zzfkg zzfkgVar, zzfkh zzfkhVar, zzfkh zzfkhVar2, boolean z) {
        zzflg.zzb(zzfkgVar, "ImpressionType is null");
        zzflg.zzb(zzfkhVar, "Impression owner is null");
        if (zzfkhVar == zzfkh.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzfkeVar == zzfke.DEFINED_BY_JAVASCRIPT && zzfkhVar == zzfkh.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfkgVar == zzfkg.DEFINED_BY_JAVASCRIPT && zzfkhVar == zzfkh.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzfka(zzfkeVar, zzfkgVar, zzfkhVar, zzfkhVar2);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfle.zzh(jSONObject, "impressionOwner", this.a);
        zzfle.zzh(jSONObject, "mediaEventsOwner", this.b);
        zzfle.zzh(jSONObject, "creativeType", this.c);
        zzfle.zzh(jSONObject, "impressionType", this.d);
        zzfle.zzh(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
