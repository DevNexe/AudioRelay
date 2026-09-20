package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzauu;
import com.google.android.gms.internal.ads.zzauv;
import com.google.android.gms.internal.ads.zzava;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzazk;
import com.google.android.gms.internal.ads.zzazu;
import com.google.android.gms.internal.ads.zzbaa;
import com.google.android.gms.internal.ads.zzban;

/* JADX INFO: loaded from: classes3.dex */
public final class f26 implements zzazu {
    public final Uri a;
    public final zzazi b;
    public final g26 c;
    public final zzbaa d;
    public final zzava e;
    public volatile boolean f;
    public boolean g;
    public long h;
    public long i;
    public final /* synthetic */ i26 j;

    public f26(i26 i26Var, Uri uri, zzazi zzaziVar, g26 g26Var, zzbaa zzbaaVar) {
        this.j = i26Var;
        uri.getClass();
        this.a = uri;
        zzaziVar.getClass();
        this.b = zzaziVar;
        g26Var.getClass();
        this.c = g26Var;
        this.d = zzbaaVar;
        this.e = new zzava();
        this.g = true;
        this.i = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzazu
    public final void zzb() {
        this.f = true;
    }

    @Override // com.google.android.gms.internal.ads.zzazu
    public final void zzc() throws Throwable {
        zzauu zzauuVar;
        long j;
        while (!this.f) {
            int i = 0;
            try {
                long j2 = this.e.zza;
                long jZzb = this.b.zzb(new zzazk(this.a, null, j2, j2, -1L, null, 0));
                this.i = jZzb;
                if (jZzb != -1) {
                    j = j2;
                    jZzb += j;
                    this.i = jZzb;
                } else {
                    j = j2;
                }
                zzauuVar = new zzauu(this.b, j, jZzb);
                try {
                    zzauv zzauvVarA = this.c.a(zzauuVar, this.b.zzc());
                    if (this.g) {
                        zzauvVarA.zze(j, this.h);
                        this.g = false;
                    }
                    long jZzd = j;
                    int iZzf = 0;
                    while (iZzf == 0) {
                        try {
                            if (this.f) {
                                iZzf = 0;
                                break;
                            }
                            this.d.zza();
                            iZzf = zzauvVarA.zzf(zzauuVar, this.e);
                            if (zzauuVar.zzd() > this.j.C + jZzd) {
                                jZzd = zzauuVar.zzd();
                                this.d.zzb();
                                i26 i26Var = this.j;
                                i26Var.I.post(i26Var.H);
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = iZzf;
                            if (i != 1 && zzauuVar != null) {
                                this.e.zza = zzauuVar.zzd();
                            }
                            zzban.zzm(this.b);
                            throw th;
                        }
                    }
                    if (iZzf != 1) {
                        this.e.zza = zzauuVar.zzd();
                        i = iZzf;
                    }
                    zzban.zzm(this.b);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                zzauuVar = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazu
    public final boolean zze() {
        return this.f;
    }
}
