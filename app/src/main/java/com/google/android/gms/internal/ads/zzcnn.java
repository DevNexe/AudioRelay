package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import defpackage.ta6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcnn {
    public final zzcno a;
    public final zzcnm b;

    public zzcnn(zzcno zzcnoVar, zzcnm zzcnmVar, byte[] bArr) {
        this.b = zzcnmVar;
        this.a = zzcnoVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcno, com.google.android.gms.internal.ads.zzcnv] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ?? r0 = this.a;
        zzapb zzapbVarZzK = r0.zzK();
        if (zzapbVarZzK == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzaox zzaoxVarZzc = zzapbVarZzK.zzc();
        if (zzaoxVarZzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        return zzaoxVarZzc.zzf(r0.getContext(), str, (View) r0, r0.zzk());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzcno, com.google.android.gms.internal.ads.zzcnv] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r0 = this.a;
        zzapb zzapbVarZzK = r0.zzK();
        if (zzapbVarZzK == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzaox zzaoxVarZzc = zzapbVarZzK.zzc();
        if (zzaoxVarZzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        return zzaoxVarZzc.zzh(r0.getContext(), (View) r0, r0.zzk());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            zzcgn.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnl
                @Override // java.lang.Runnable
                public final void run() {
                    zzcnn zzcnnVar = this.zza;
                    String str2 = str;
                    zzcnnVar.getClass();
                    Uri uri = Uri.parse(str2);
                    zzcmu zzcmuVar = ((ta6) zzcnnVar.b.zza).I;
                    if (zzcmuVar == null) {
                        zzcgn.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    } else {
                        zzcmuVar.zzi(uri);
                    }
                }
            });
        }
    }
}
