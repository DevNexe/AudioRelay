package defpackage;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzflq;

/* JADX INFO: loaded from: classes3.dex */
public final class jl6 implements Runnable {
    public final /* synthetic */ int w = 0;

    public jl6() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w) {
            case 0:
                Handler handler = zzflq.i;
                if (handler != null) {
                    handler.post(zzflq.j);
                    zzflq.i.postDelayed(zzflq.k, 200L);
                }
                break;
        }
    }

    public /* synthetic */ jl6(int i) {
    }
}
