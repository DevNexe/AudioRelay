package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzfgs;
import com.google.android.gms.internal.ads.zzfyk;

/* JADX INFO: loaded from: classes3.dex */
public final class zg6 implements zzfyk {
    public final /* synthetic */ zzfgs w;

    public zg6(zzfgs zzfgsVar) {
        this.w = zzfgsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        zzcgn.zzg("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final /* bridge */ /* synthetic */ void mo32zzb(Object obj) {
        try {
            this.w.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            zzcgn.zzg("Error executing function on offline buffered ping database: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
