package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes3.dex */
public final class kf6 extends ze6 {
    public final /* synthetic */ Bundle A;
    public final /* synthetic */ Activity B;
    public final /* synthetic */ qg6 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf6(qg6 qg6Var, Bundle bundle, Activity activity) {
        super(qg6Var.w, true);
        this.C = qg6Var;
        this.A = bundle;
        this.B = activity;
    }

    @Override // defpackage.ze6
    public final void a() {
        Bundle bundle;
        if (this.A != null) {
            bundle = new Bundle();
            if (this.A.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.A.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        zzcc zzccVar = this.C.w.g;
        oa3.h(zzccVar);
        zzccVar.onActivityCreated(new ObjectWrapper(this.B), bundle, this.x);
    }
}
