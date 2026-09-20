package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.internal.QnHx;

/* JADX INFO: loaded from: classes.dex */
public abstract class wr5 extends e76 {
    public final int d;
    public final Bundle e;
    public final /* synthetic */ QnHx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr5(QnHx qnHx, int i, Bundle bundle) {
        super(qnHx, Boolean.TRUE);
        this.f = qnHx;
        this.d = i;
        this.e = bundle;
    }

    @Override // defpackage.e76
    public final /* bridge */ /* synthetic */ void a() {
        QnHx qnHx = this.f;
        int i = this.d;
        if (i != 0) {
            qnHx.m(1, null);
            Bundle bundle = this.e;
            c(new z50(i, bundle != null ? (PendingIntent) bundle.getParcelable(QnHx.KEY_PENDING_INTENT) : null));
        } else {
            if (d()) {
                return;
            }
            qnHx.m(1, null);
            c(new z50(8, null));
        }
    }

    @Override // defpackage.e76
    public final void b() {
    }

    public abstract void c(z50 z50Var);

    public abstract boolean d();
}
