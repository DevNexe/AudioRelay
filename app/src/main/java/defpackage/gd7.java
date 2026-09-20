package defpackage;

import com.android.billingclient.api.T23;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gd7 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ gd7(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                ((om4) obj).a(T23.m, null);
                break;
            default:
                Z7O z7o = (Z7O) ((r60.CQf) obj);
                r60 r60Var = (r60) z7o.x;
                dl4 dl4Var = (dl4) z7o.y;
                boolean z = false;
                int i2 = ((m17) r60Var).a.b.getInt("consent_status", 0);
                a62.a.j("admob_consent_status", String.valueOf(i2));
                if (i2 != 0 && (i2 == 1 || (i2 != 2 && i2 == 3))) {
                    z = true;
                }
                ((yk4.QnHx) dl4Var).b(Boolean.valueOf(z));
                break;
        }
    }
}
