package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.QnHx;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g9D extends B8C {
    public final /* synthetic */ String w;
    public final /* synthetic */ FLr x;
    public final /* synthetic */ QnHx y;

    public g9D(QnHx qnHx, String str, FLr fLr) {
        this.y = qnHx;
        this.w = str;
        this.x = fLr;
    }

    @Override // defpackage.B8C
    public final void H0(Object obj) {
        QnHx qnHx = this.y;
        HashMap map = qnHx.c;
        String str = this.w;
        Integer num = (Integer) map.get(str);
        FLr fLr = this.x;
        if (num != null) {
            qnHx.e.add(str);
            try {
                qnHx.b(num.intValue(), fLr, obj);
                return;
            } catch (Exception e) {
                qnHx.e.remove(str);
                throw e;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + fLr + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    @Override // defpackage.B8C
    public final void Q0() {
        Integer num;
        QnHx qnHx = this.y;
        ArrayList<String> arrayList = qnHx.e;
        String str = this.w;
        if (!arrayList.contains(str) && (num = (Integer) qnHx.c.remove(str)) != null) {
            qnHx.b.remove(num);
        }
        qnHx.f.remove(str);
        HashMap map = qnHx.g;
        if (map.containsKey(str)) {
            StringBuilder sbA = N.a("Dropping pending result for request ", str, ": ");
            sbA.append(map.get(str));
            Log.w("ActivityResultRegistry", sbA.toString());
            map.remove(str);
        }
        Bundle bundle = qnHx.h;
        if (bundle.containsKey(str)) {
            StringBuilder sbA2 = N.a("Dropping pending result for request ", str, ": ");
            sbA2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sbA2.toString());
            bundle.remove(str);
        }
        if (((QnHx.CQf) qnHx.d.get(str)) != null) {
            throw null;
        }
    }
}
