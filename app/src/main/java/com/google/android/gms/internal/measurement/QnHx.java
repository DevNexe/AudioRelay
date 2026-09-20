package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import defpackage.oa3;
import defpackage.ze6;

/* JADX INFO: loaded from: classes3.dex */
public final class QnHx extends ze6 {
    public final /* synthetic */ int A;
    public final /* synthetic */ CQf B;
    public final /* synthetic */ Object C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QnHx(CQf cQf, Object obj, int i) {
        super(cQf, true);
        this.A = i;
        this.B = cQf;
        this.C = obj;
    }

    @Override // defpackage.ze6
    public final void a() {
        switch (this.A) {
            case 0:
                zzcc zzccVar = this.B.g;
                oa3.h(zzccVar);
                zzccVar.registerOnMeasurementEventListener((zzdv) this.C);
                break;
            case 1:
                zzcc zzccVar2 = this.B.g;
                oa3.h(zzccVar2);
                zzccVar2.setConsent((Bundle) this.C, this.w);
                break;
            case 2:
                zzcc zzccVar3 = this.B.g;
                oa3.h(zzccVar3);
                zzccVar3.endAdUnitExposure((String) this.C, this.x);
                break;
            default:
                zzcc zzccVar4 = this.B.g;
                oa3.h(zzccVar4);
                zzccVar4.generateEventId((zzbz) this.C);
                break;
        }
    }

    @Override // defpackage.ze6
    public final void b() {
        switch (this.A) {
            case 3:
                ((zzbz) this.C).zzd(null);
                break;
        }
    }
}
