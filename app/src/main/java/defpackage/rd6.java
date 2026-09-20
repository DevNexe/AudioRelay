package defpackage;

import com.google.android.gms.internal.measurement.CQf;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes3.dex */
public final class rd6 extends ze6 {
    public final /* synthetic */ int A;
    public final /* synthetic */ zzbz B;
    public final /* synthetic */ CQf C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rd6(CQf cQf, zzbz zzbzVar, int i) {
        super(cQf, true);
        this.A = i;
        this.C = cQf;
        this.B = zzbzVar;
    }

    @Override // defpackage.ze6
    public final void a() {
        switch (this.A) {
            case 0:
                zzcc zzccVar = this.C.g;
                oa3.h(zzccVar);
                zzccVar.getCachedAppInstanceId(this.B);
                break;
            default:
                zzcc zzccVar2 = this.C.g;
                oa3.h(zzccVar2);
                zzccVar2.getCurrentScreenClass(this.B);
                break;
        }
    }

    @Override // defpackage.ze6
    public final void b() {
        int i = this.A;
        zzbz zzbzVar = this.B;
        switch (i) {
            case 0:
                zzbzVar.zzd(null);
                break;
            default:
                zzbzVar.zzd(null);
                break;
        }
    }
}
