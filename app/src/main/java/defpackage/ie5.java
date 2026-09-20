package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ie5 implements Runnable {
    public final /* synthetic */ ne5 w;
    public final /* synthetic */ ua5 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Runnable z;

    public /* synthetic */ ie5(ne5 ne5Var, j4 j4Var, int i, Runnable runnable) {
        this.w = ne5Var;
        this.x = j4Var;
        this.y = i;
        this.z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ua5 ua5Var = this.x;
        final int i = this.y;
        Runnable runnable = this.z;
        final ne5 ne5Var = this.w;
        qy4 qy4Var = ne5Var.f;
        try {
            try {
                mu0 mu0Var = ne5Var.c;
                Objects.requireNonNull(mu0Var);
                qy4Var.e(new sn1(mu0Var, 2));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ne5Var.a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    ne5Var.a(ua5Var, i);
                } else {
                    qy4Var.e(new qy4.QnHx() { // from class: je5
                        @Override // qy4.QnHx
                        public final Object e() {
                            ne5Var.d.a(ua5Var, i + 1);
                            return null;
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                ne5Var.d.a(ua5Var, i + 1);
            }
        } finally {
            runnable.run();
        }
    }
}
