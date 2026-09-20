package defpackage;

import android.view.View;
import com.google.android.gms.ads.AdView;

/* JADX INFO: loaded from: classes.dex */
public final class JBK6 {
    public final View a;
    public final int b = 1;

    public JBK6(AdView adView) {
        this.a = adView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JBK6)) {
            return false;
        }
        JBK6 jbk6 = (JBK6) obj;
        return ur1.a(this.a, jbk6.a) && this.b == jbk6.b;
    }

    public final int hashCode() {
        return O.h(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdsFragmentResult(adView=" + this.a + ", placement=" + IGp3.a(this.b) + ")";
    }
}
