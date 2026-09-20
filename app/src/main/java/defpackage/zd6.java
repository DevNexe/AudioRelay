package defpackage;

import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.CQf;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes3.dex */
public final class zd6 extends ze6 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public final /* synthetic */ CQf C;
    public final /* synthetic */ Object D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd6(CQf cQf, Object obj) {
        super(cQf, false);
        this.A = 0;
        this.C = cQf;
        this.B = "Error with data collection. Data lost.";
        this.D = obj;
    }

    @Override // defpackage.ze6
    public final void a() {
        switch (this.A) {
            case 0:
                zzcc zzccVar = this.C.g;
                oa3.h(zzccVar);
                zzccVar.logHealthData(5, this.B, new ObjectWrapper(this.D), new ObjectWrapper(null), new ObjectWrapper(null));
                break;
            default:
                zzcc zzccVar2 = this.C.g;
                oa3.h(zzccVar2);
                zzccVar2.getMaxUserProperties(this.B, (zzbz) this.D);
                break;
        }
    }

    @Override // defpackage.ze6
    public final void b() {
        switch (this.A) {
            case 1:
                ((zzbz) this.D).zzd(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd6(CQf cQf, String str, zzbz zzbzVar) {
        super(cQf, true);
        this.A = 1;
        this.C = cQf;
        this.B = str;
        this.D = zzbzVar;
    }
}
