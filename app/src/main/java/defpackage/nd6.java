package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.CQf;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes3.dex */
public final class nd6 extends ze6 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ CQf C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nd6(CQf cQf, Object obj, int i) {
        super(cQf, true);
        this.A = i;
        this.C = cQf;
        this.B = obj;
    }

    @Override // defpackage.ze6
    public final void a() {
        switch (this.A) {
            case 0:
                zzcc zzccVar = this.C.g;
                oa3.h(zzccVar);
                zzccVar.getGmpAppId((zzbz) this.B);
                break;
            case 1:
                zzcc zzccVar2 = this.C.g;
                oa3.h(zzccVar2);
                zzccVar2.getCurrentScreenName((zzbz) this.B);
                break;
            default:
                zzcc zzccVar3 = this.C.g;
                oa3.h(zzccVar3);
                zzccVar3.setConditionalUserProperty((Bundle) this.B, this.w);
                break;
        }
    }

    @Override // defpackage.ze6
    public final void b() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((zzbz) obj).zzd(null);
                break;
            case 1:
                ((zzbz) obj).zzd(null);
                break;
        }
    }
}
