package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.android.billingclient.api.QnHx;
import com.facebook.ads.AdError;
import com.revenuecat.purchases.Purchases$Companion$canMakePayments$2$1;
import com.revenuecat.purchases.interfaces.Callback;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tp3 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ tp3(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w) {
            case 0:
                ((sp3.NUlFixed) this.x).d((Typeface) this.y);
                return;
            case 1:
                ProfileInstallerInitializer profileInstallerInitializer = (ProfileInstallerInitializer) this.x;
                Context context = (Context) this.y;
                profileInstallerInitializer.getClass();
                (Build.VERSION.SDK_INT >= 28 ? ProfileInstallerInitializer.CQf.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new eLUR(context, 1), new Random().nextInt(Math.max(AdError.NETWORK_ERROR_CODE, 1)) + 5000);
                return;
            case 2:
                f22 f22Var = (f22) this.x;
                pg3 pg3Var = (pg3) this.y;
                synchronized (f22Var) {
                    if (f22Var.b == 0) {
                        f22Var.a.add((pg3<T>) pg3Var);
                    } else {
                        f22Var.b.add((T) pg3Var.get());
                    }
                }
                return;
            default:
                Purchases$Companion$canMakePayments$2$1.m8onBillingServiceDisconnected$lambda2((QnHx) this.x, (Callback) this.y);
                return;
        }
    }
}
