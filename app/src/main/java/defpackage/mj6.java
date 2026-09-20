package defpackage;

import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes3.dex */
public final class mj6 implements kw6 {
    public final /* synthetic */ vq6 a;

    public mj6(vq6 vq6Var) {
        this.a = vq6Var;
    }

    @Override // defpackage.kw6
    public final void a(long j, Bundle bundle, String str, String str2) {
        if (str == null || str.equals("crash") || !(!a76.a.contains(str2))) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(MediationMetaData.KEY_NAME, str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        ((cb0) this.a.a).a(3, bundle2);
    }
}
