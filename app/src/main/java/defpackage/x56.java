package defpackage;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbpp;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbtr;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class x56 implements zzbpq {
    public final /* synthetic */ zzbtq a;
    public final /* synthetic */ zzbsm b;
    public final /* synthetic */ zzbtr c;

    public x56(zzbtr zzbtrVar, zzbtq zzbtqVar, zzbsu zzbsuVar) {
        this.c = zzbtrVar;
        this.a = zzbtqVar;
        this.b = zzbsuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        synchronized (this.c.a) {
            try {
                if (this.a.zze() != -1 && this.a.zze() != 1) {
                    this.c.i = 0;
                    zzbsm zzbsmVar = this.b;
                    zzbsmVar.zzq("/log", zzbpp.zzg);
                    zzbsmVar.zzq("/result", zzbpp.zzo);
                    this.a.zzh(this.b);
                    this.c.h = this.a;
                    zze.zza("Successfully loaded JS Engine.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
