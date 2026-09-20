package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* JADX INFO: loaded from: classes.dex */
public final class IHFx implements wq1 {
    public final Vb5 a;

    public static final class QnHx implements eq1 {
        public final Activity a;
        public InterstitialAd b = null;

        public QnHx(Activity activity) {
            this.a = activity;
        }

        @Override // defpackage.eq1
        public final void a() {
            InterstitialAd interstitialAd = this.b;
            if (interstitialAd != null) {
                interstitialAd.show(this.a);
            }
        }

        @Override // defpackage.eq1
        public final void destroy() {
        }

        @Override // defpackage.eq1
        public final boolean isReady() {
            return this.b != null;
        }
    }

    public IHFx(Vb5 vb5) {
        this.a = vb5;
    }

    @Override // defpackage.wq1
    public final QnHx a(Activity activity, uq1 uq1Var) {
        QnHx qnHx = new QnHx(activity);
        Context applicationContext = activity.getApplicationContext();
        Vb5 vb5 = this.a;
        String str = vb5.a;
        activity.getApplicationContext();
        InterstitialAd.load(applicationContext, str, kd.g(vb5), new n9Y(qnHx, uq1Var));
        return qnHx;
    }
}
