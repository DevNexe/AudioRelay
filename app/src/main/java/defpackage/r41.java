package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class r41 implements Callable<t41.QnHx> {
    public final /* synthetic */ String w;
    public final /* synthetic */ Context x;
    public final /* synthetic */ o41 y;
    public final /* synthetic */ int z;

    public r41(String str, Context context, o41 o41Var, int i) {
        this.w = str;
        this.x = context;
        this.y = o41Var;
        this.z = i;
    }

    @Override // java.util.concurrent.Callable
    public final t41.QnHx call() {
        try {
            return t41.a(this.w, this.x, this.y, this.z);
        } catch (Throwable unused) {
            return new t41.QnHx(-3);
        }
    }
}
