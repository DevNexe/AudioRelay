package defpackage;

import android.content.Context;
import com.google.android.gms.internal.measurement.CQf;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
public final class tx0 implements lu0 {
    public final Context a;

    public tx0(Context context) {
        this.a = context;
    }

    @Override // defpackage.lu0
    public final nx0 a() {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.a);
        Boolean bool = Boolean.TRUE;
        CQf cQf = firebaseAnalytics.a;
        cQf.getClass();
        cQf.c(new zb6(cQf, bool, 0));
        return new nx0(firebaseAnalytics);
    }
}
