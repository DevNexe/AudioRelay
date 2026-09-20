package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzaaf;
import com.google.android.gms.internal.ads.zzaak;
import com.google.android.gms.internal.ads.zzdg;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzfa;
import com.google.android.gms.internal.ads.zzfw;
import com.google.android.gms.internal.ads.zzrv;
import com.google.android.gms.internal.ads.zzrx;
import com.google.android.gms.internal.ads.zzsz;
import com.google.android.gms.internal.ads.zztv;
import com.google.android.gms.internal.ads.zzwp;
import com.google.android.gms.internal.ads.zzzi;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class eb7 implements zzwp, zzrv {
    public final Uri b;
    public final zzfw c;
    public final zzsz d;
    public final zzzi e;
    public final zzdg f;
    public volatile boolean h;
    public long j;
    public zzfa k;
    public zztv m;
    public boolean n;
    public final /* synthetic */ hb7 o;
    public final zzaaf g = new zzaaf();
    public boolean i = true;
    public long l = -1;
    public final long a = zzrx.zza();

    public eb7(hb7 hb7Var, Uri uri, zzev zzevVar, zzsz zzszVar, zzzi zzziVar, zzdg zzdgVar) {
        this.o = hb7Var;
        this.b = uri;
        this.c = new zzfw(zzevVar);
        this.d = zzszVar;
        this.e = zzziVar;
        this.f = zzdgVar;
        zzey zzeyVar = new zzey();
        zzeyVar.zzd(uri);
        zzeyVar.zzc(0L);
        zzeyVar.zza(6);
        zzeyVar.zzb(hb7.f0);
        this.k = zzeyVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zza(zzed zzedVar) {
        long jMax;
        if (this.n) {
            Map map = hb7.f0;
            jMax = Math.max(this.o.b(), this.j);
        } else {
            jMax = this.j;
        }
        int iZza = zzedVar.zza();
        zztv zztvVar = this.m;
        zztvVar.getClass();
        zzaak.zzb(zztvVar, zzedVar, iZza);
        zztvVar.zzs(jMax, 1, iZza, 0, null);
        this.n = true;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zzh() {
        this.h = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01ca */
    @Override // com.google.android.gms.internal.ads.zzwp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb7.zzi():void");
    }
}
