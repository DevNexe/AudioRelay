package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzauu;
import com.google.android.gms.internal.ads.zzauv;
import com.google.android.gms.internal.ads.zzauw;
import com.google.android.gms.internal.ads.zzayq;
import com.google.android.gms.internal.ads.zzban;
import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class g26 {
    public final zzauv[] a;
    public final zzauw b;
    public zzauv c;

    public g26(zzauv[] zzauvVarArr, zzauw zzauwVar) {
        this.a = zzauvVarArr;
        this.b = zzauwVar;
    }

    public final zzauv a(zzauu zzauuVar, Uri uri) throws zzayq {
        zzauv zzauvVar = this.c;
        if (zzauvVar != null) {
            return zzauvVar;
        }
        zzauv[] zzauvVarArr = this.a;
        for (zzauv zzauvVar2 : zzauvVarArr) {
            try {
                if (zzauvVar2.zzg(zzauuVar)) {
                    this.c = zzauvVar2;
                    zzauuVar.zze();
                    break;
                }
                continue;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                zzauuVar.zze();
                throw th;
            }
            zzauuVar.zze();
        }
        zzauv zzauvVar3 = this.c;
        if (zzauvVar3 == null) {
            throw new zzayq(fc2.a("None of the available extractors (", zzban.zzk(zzauvVarArr), ") could read the stream."), uri);
        }
        zzauvVar3.zzd(this.b);
        return this.c;
    }
}
