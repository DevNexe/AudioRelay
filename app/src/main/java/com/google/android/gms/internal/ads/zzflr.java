package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzflr extends zzfls {
    public final HashSet c;
    public final JSONObject d;
    public final long e;

    public zzflr(zzflk zzflkVar, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzflkVar, null);
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfls, android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
