package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.internal.ads.zzcba;
import com.google.android.gms.internal.ads.zzebq;
import com.google.android.gms.internal.ads.zzfxv;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzfyx;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class zzak implements zzfxv {
    public final Executor a;
    public final zzebq b;

    public zzak(Executor executor, zzebq zzebqVar) {
        this.a = executor;
        this.b = zzebqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxv
    public final /* bridge */ /* synthetic */ zzfyx zza(Object obj) {
        final zzcba zzcbaVar = (zzcba) obj;
        return zzfyo.zzn(this.b.zzb(zzcbaVar), new zzfxv() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj2) {
                zzcba zzcbaVar2 = zzcbaVar;
                zzam zzamVar = new zzam(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    zzamVar.zzb = zzaw.zzb().zzh(zzcbaVar2.zza).toString();
                } catch (JSONException unused) {
                    zzamVar.zzb = "{}";
                }
                return zzfyo.zzi(zzamVar);
            }
        }, this.a);
    }
}
