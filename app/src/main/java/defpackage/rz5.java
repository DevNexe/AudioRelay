package defpackage;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import com.google.android.gms.internal.ads.zzaqk;

/* JADX INFO: loaded from: classes3.dex */
public final class rz5 implements AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ zzaqk a;

    public rz5(zzaqk zzaqkVar) {
        this.a = zzaqkVar;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            this.a.a = System.currentTimeMillis();
            this.a.d = true;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzaqk zzaqkVar = this.a;
        long j = zzaqkVar.b;
        if (j > 0 && jCurrentTimeMillis >= j) {
            zzaqkVar.c = jCurrentTimeMillis - j;
        }
        zzaqkVar.d = false;
    }
}
