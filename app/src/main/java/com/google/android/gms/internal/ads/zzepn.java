package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzepn implements zzeun {
    public final zzfyy a;
    public final zzdvj b;
    public final zzdzq c;
    public final zzepq d;

    public zzepn(zzfyy zzfyyVar, zzdvj zzdvjVar, zzdzq zzdzqVar, zzepq zzepqVar) {
        this.a = zzfyyVar;
        this.b = zzdvjVar;
        this.c = zzdzqVar;
        this.d = zzepqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        if (!zzfsu.zzd((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbk))) {
            zzepq zzepqVar = this.d;
            if (!zzepqVar.zzb() && this.c.zzt()) {
                zzepqVar.zza(true);
                return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzepn zzepnVar = this.zza;
                        zzepnVar.getClass();
                        List<String> listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbk)).split(";"));
                        Bundle bundle = new Bundle();
                        for (String str : listAsList) {
                            try {
                                zzfei zzfeiVarZzc = zzepnVar.b.zzc(str, new JSONObject());
                                zzfeiVarZzc.zzA();
                                Bundle bundle2 = new Bundle();
                                try {
                                    zzbxl zzbxlVarZzf = zzfeiVarZzc.zzf();
                                    if (zzbxlVarZzf != null) {
                                        bundle2.putString("sdk_version", zzbxlVarZzf.toString());
                                    }
                                } catch (zzfds unused) {
                                }
                                try {
                                    zzbxl zzbxlVarZze = zzfeiVarZzc.zze();
                                    if (zzbxlVarZze != null) {
                                        bundle2.putString("adapter_version", zzbxlVarZze.toString());
                                    }
                                } catch (zzfds unused2) {
                                }
                                bundle.putBundle(str, bundle2);
                            } catch (zzfds unused3) {
                            }
                        }
                        return new zzepp(bundle);
                    }
                });
            }
        }
        return zzfyo.zzi(new zzepp(new Bundle()));
    }
}
