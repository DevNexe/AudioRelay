package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class cb0 implements CSv.QnHx {
    public G0q a;
    public G0q b;

    public final void a(int i, Bundle bundle) {
        String str = String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString(MediationMetaData.KEY_NAME);
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            G0q g0q = "clx".equals(bundle2.getString("_o")) ? this.a : this.b;
            if (g0q == null) {
                return;
            }
            g0q.d(bundle2, string);
        }
    }
}
