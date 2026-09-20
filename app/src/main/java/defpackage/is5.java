package defpackage;

import com.google.android.gms.internal.ads.zzaag;
import com.google.android.gms.internal.ads.zzaai;
import com.google.android.gms.internal.ads.zzaaz;

/* JADX INFO: loaded from: classes3.dex */
public final class is5 implements zzaai {
    public final long a;
    public final /* synthetic */ zzaaz b;

    public is5(zzaaz zzaazVar, long j) {
        this.b = zzaazVar;
        this.a = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final long zze() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final zzaag zzg(long j) {
        zzaaz zzaazVar = this.b;
        zzaag zzaagVarA = zzaazVar.g[0].a(j);
        int i = 1;
        while (true) {
            os5[] os5VarArr = zzaazVar.g;
            if (i >= os5VarArr.length) {
                return zzaagVarA;
            }
            zzaag zzaagVarA2 = os5VarArr[i].a(j);
            if (zzaagVarA2.zza.zzc < zzaagVarA.zza.zzc) {
                zzaagVarA = zzaagVarA2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final boolean zzh() {
        return true;
    }
}
