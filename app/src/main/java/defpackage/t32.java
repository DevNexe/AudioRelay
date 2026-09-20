package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes3.dex */
public final class t32 implements ComponentCallbacks {
    public final j81<Configuration, sd5> w;

    public t32(r32 r32Var) {
        this.w = r32Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.w.invoke(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
