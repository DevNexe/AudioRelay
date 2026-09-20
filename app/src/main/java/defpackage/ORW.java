package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ORW implements ComponentCallbacks2 {
    public final /* synthetic */ jl3<Configuration> w;
    public final /* synthetic */ fj1 x;

    public ORW(jl3<Configuration> jl3Var, fj1 fj1Var) {
        this.w = jl3Var;
        this.x = fj1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        jl3<Configuration> jl3Var = this.w;
        Configuration configuration2 = jl3Var.w;
        int iUpdateFrom = configuration2 != null ? configuration2.updateFrom(configuration) : -1;
        Iterator<Map.Entry<fj1.CQf, WeakReference<fj1.QnHx>>> it = this.x.a.entrySet().iterator();
        while (it.hasNext()) {
            fj1.QnHx qnHx = it.next().getValue().get();
            if (qnHx == null || Configuration.needNewResources(iUpdateFrom, qnHx.b)) {
                it.remove();
            }
        }
        jl3Var.w = configuration;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.x.a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.x.a.clear();
    }
}
