package androidx.work;

import android.content.Context;
import defpackage.B8C;
import defpackage.hk1;
import defpackage.nn5;
import defpackage.s52;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements hk1<B8C> {
    public static final String a = s52.e("WrkMgrInitializer");

    @Override // defpackage.hk1
    public final List<Class<? extends hk1<?>>> a() {
        return Collections.emptyList();
    }

    @Override // defpackage.hk1
    public final B8C b(Context context) {
        s52.c().a(a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        nn5.X0(context, new QnHx(new QnHx.C0032QnHx()));
        return nn5.W0(context);
    }
}
