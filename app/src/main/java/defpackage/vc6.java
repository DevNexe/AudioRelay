package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.CQf;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes3.dex */
public final class vc6 extends ze6 {
    public final /* synthetic */ Context A;
    public final /* synthetic */ Bundle B;
    public final /* synthetic */ CQf C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc6(CQf cQf, String str, String str2, Context context, Bundle bundle) {
        super(cQf, true);
        this.C = cQf;
        this.A = context;
        this.B = bundle;
    }

    @Override // defpackage.ze6
    public final void a() {
        zzcc zzccVarAsInterface;
        try {
            oa3.h(this.A);
            CQf cQf = this.C;
            Context context = this.A;
            cQf.getClass();
            try {
                zzccVarAsInterface = zzcb.asInterface(DynamiteModule.c(context, DynamiteModule.c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.LoadingException e) {
                cQf.b(e, true, false);
                zzccVarAsInterface = null;
            }
            cQf.g = zzccVarAsInterface;
            if (this.C.g == null) {
                this.C.getClass();
                Log.w("FA", "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(this.A, ModuleDescriptor.MODULE_ID);
            int iD = DynamiteModule.d(this.A, ModuleDescriptor.MODULE_ID, false);
            w96 w96Var = new w96(73000L, Math.max(iA, iD), iD < iA, null, null, null, this.B, hm6.a(this.A));
            zzcc zzccVar = this.C.g;
            oa3.h(zzccVar);
            zzccVar.initialize(new ObjectWrapper(this.A), w96Var, this.w);
        } catch (Exception e2) {
            this.C.b(e2, true, false);
        }
    }
}
