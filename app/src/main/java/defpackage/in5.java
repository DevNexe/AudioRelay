package defpackage;

import android.content.Context;
import androidx.work.impl.foreground.QnHx;
import androidx.work.impl.model.CQf;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class in5 implements Runnable {
    public final /* synthetic */ jn5 A;
    public final /* synthetic */ pg4 w;
    public final /* synthetic */ UUID x;
    public final /* synthetic */ g51 y;
    public final /* synthetic */ Context z;

    public in5(jn5 jn5Var, pg4 pg4Var, UUID uuid, g51 g51Var, Context context) {
        this.A = jn5Var;
        this.w = pg4Var;
        this.x = uuid;
        this.y = g51Var;
        this.z = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.w.w instanceof Xn1.CQf)) {
                String string = this.x.toString();
                kn5 kn5VarF = ((CQf) this.A.c).f(string);
                if (kn5VarF == null || kn5VarF.a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((oe3) this.A.b).e(string, this.y);
                this.z.startService(QnHx.a(this.z, string, this.y));
            }
            this.w.i(null);
        } catch (Throwable th) {
            this.w.j(th);
        }
    }
}
